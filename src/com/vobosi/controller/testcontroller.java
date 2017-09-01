package com.vobosi.controller;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.text.StrBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import com.vobosi.Interface.UserService;
import com.vobosi.Interface.modbusDriverService;
import com.vobosi.Interface.testservice;
import com.vobosi.pojo.pau.pauset;
import com.vobosi.pojo.pau.paustatus;
import com.vobosi.pojo.user.user;
import com.vobosi.service.DataEngineServiceImpl;
import com.vobosi.utils.QRCodeUtil;
import com.vobosi.utils.ServerHandler;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.FixedLengthFrameDecoder;
import io.netty.handler.codec.string.StringDecoder;

@Controller
public class testcontroller {

	@Autowired
	private testservice testservice;
	@Autowired
	private UserService userService;
	@Autowired
	private modbusDriverService modbusDriverService;

	// 用户登出
	@RequestMapping(value = "/logOut.do")
	public String logOut(HttpServletRequest request,HttpServletResponse response) {
		HttpSession session = request.getSession();
		Object attribute = session.getAttribute("user");
		if (null != attribute) {
			session.removeAttribute("user");
		}
		return "redirect:/login.do";
	}

	// 用户名检查重复ajax
	@RequestMapping(value = "/userNameCheck.do")
	@ResponseBody
	public user userNameCheck(@RequestBody user u) {
		Integer userNum = userService.userNameCheck(u);
		System.out.println("该用户名数量为: " + userNum);
		if (userNum > 0) {
			return u;
		}
		u.setUsername("");
		return u;
	}

	// 用户注册
	@RequestMapping(value = "/userRegister")
	public String userRegister(String userName, String passWord, String email, String rePassWord) {

		if (null != userName && null != passWord && null != email && null != rePassWord) {
			if (rePassWord.equals(passWord)) {
				Boolean userRegisterFlag = userService.userRegister(userName, passWord, email);
				if (null != userRegisterFlag && userRegisterFlag) {
					return "login";
				}
			}
		}
		return "regist";
	}

	// 用户注册跳转页面
	@RequestMapping(value = "/userRegisterShow.do")
	public String userRegisterShow() {
		return "regist";
	}

	// 业务逻辑页面展示
	@RequestMapping(value = "/index.do")
	public String index(HttpServletRequest request,Model model,HttpServletResponse response) {
		HttpSession session = request.getSession();
		//登录前的判断是否已经设置过自动登录了
		// 获取cookie
		Cookie[] cookies = request.getCookies();
		// 遍历并判断是否有cookie如果有就返回REDISSESSION（cookie的名字）对应的值
		if (null != cookies && cookies.length > 0) {
			for (Cookie cookie : cookies) {
				if ("autoLogin".equals(cookie.getName())) {
					String value = cookie.getValue();
					if("y".equals(value)){
						return "customer";
					}
				}
			}
		}
		
		if (session != null) {
			user u=(user) session.getAttribute("user");
			if (null != u) {
				//页面回显登录用户数据
				model.addAttribute("user", u);
				//自动登录的cookie设置
				String autoLogin = (String) session.getAttribute("autologin");
				if(null!=autoLogin){
					//需要自动登录的cookie写回浏览器
					Cookie cookie = new Cookie("autoLogin", "y");
					// 路径 /代表所有访问该网址都带这个cookie值
					cookie.setPath("/");
					// 时间 0 立即 -1 关闭浏览器 >0代表cookie存活时间
					cookie.setMaxAge(60*60*24*7);
					// 写回浏览器
					response.addCookie(cookie);
				}else{
					//不用自动登录的cookie写回浏览器
					Cookie cookie = new Cookie("autoLogin", "n");
					// 路径 /代表所有访问该网址都带这个cookie值
					cookie.setPath("/");
					// 时间 0 立即 -1 关闭浏览器 >0代表cookie存活时间
					cookie.setMaxAge(-1);
					// 写回浏览器
					response.addCookie(cookie);
				}
				return "customer";
			}
		}return"redirect:/login.do";

	}

	// 登录
	@RequestMapping(value = "/login.do")
	public String login(String username, String password, HttpServletRequest request, String remember) {
		user userFind = null;
		// 查找数据库中用户名及密码
		if (null != username) {
			userFind = userService.userFind(username);
			//System.out.println("登录用户为： "+userFind.getUsername());
		}
		// 获取session为用户登录信息以后存入context域做准备
		HttpSession session = request.getSession();
		if (null != userFind) {
			if (session != null) {
				if (null != username && null != password) {
					// 根据数据库获取到的记录比较是否正确登录
					if (userFind.getUsername().equals(username) && userFind.getPassword().equals(password)) {
						// 正确登录的话就把用户名存入context域中
						session.setAttribute("user", userFind);
						//自动登录的判断
						if(null!=remember && "y".equals(remember)){
							session.setAttribute("autologin", "y");
						}else{
							session.setAttribute("autologin", "n");
						}
						return "redirect:/index.do";
					}
				}
			}
		}
		return "login";
	}

	// 添加数据
	@RequestMapping(value = "/insertdata.do")
	@ResponseBody // 注意此处@RequestBody是为了接收json个数数据必须有的注解
	public paustatus insertdata(@RequestBody paustatus pau) {
		testservice.savepaustatus();
		return pau;
	}

	// 单个删除数据
	@RequestMapping(value = "/deldata.do")
	@ResponseBody // 注意此处@RequestBody是为了接收json个数数据必须有的注解
	public void deldata(@RequestBody paustatus pau) {
		testservice.deldata(pau.getStime());
	}

	// 批量删除数据
	@RequestMapping(value = "/delalldata.do")
	@ResponseBody // 注意此处@RequestBody是为了接收json个数数据必须有的注解
	public void delalldata(@RequestBody paustatus pau) {
		testservice.delalldata(pau.getStime());
	}

	// 折线图回显数据showdata
	@RequestMapping(value = "/showdata.do")
	@ResponseBody
	public String showdata() {
		String showdata = testservice.showdata();
		return showdata;
	}

	// 测试线程模块
	@RequestMapping(value = "/threadrun.do")
	public void threadrun(HttpServletRequest request) {
		ServletContext servletContext = request.getServletContext();
		DataEngineServiceImpl dataEngine = new DataEngineServiceImpl();
		dataEngine.setServletcontext(servletContext);
		dataEngine.start();
	}

	// 测试线程模块停止功能功能
	@RequestMapping(value = "/threadstop.do")
	@ResponseBody
	public String threadstop(HttpServletRequest request) {
		ServletContext servletContext = request.getServletContext();
		Boolean flag = null;
		if (null != servletContext) {
			flag = (Boolean) servletContext.getAttribute("flag");
			// 数据采集开关反转
			if (null != flag) {
				if (flag == true) {
					flag = false;
				} else {
					flag = true;
				}
			}
			// 设置开关
			servletContext.setAttribute("flag", flag);
		}
		return flag.toString();
	}

	// 生成二维码功能
	@RequestMapping(value = "/QR_Code.do")
	@ResponseBody
	public String makeQR(HttpServletRequest request) throws Exception {
		String path = request.getServletContext().getRealPath("/");
		String msg = "服务器端生成的二维码！" + System.currentTimeMillis();
		// 生成uuid
		UUID guid = UUID.randomUUID();
		QRCodeUtil.encode(msg, path + "imgs\\", guid.toString());
		return "/imgs/" + guid.toString() + ".jpg";
	}
	
	//启动netty框架等待接收参数
	@RequestMapping(value = "/nettyServer.do")
	public void nettyServer() throws Exception{
		//1 创建2个线程，一个是负责接收客户端的连接。一个是负责进行数据传输的
		EventLoopGroup pGroup = new NioEventLoopGroup();
		EventLoopGroup cGroup = new NioEventLoopGroup();
		
		//2 创建服务器辅助类
		ServerBootstrap b = new ServerBootstrap();
		b.group(pGroup, cGroup)
		 .channel(NioServerSocketChannel.class)
		 .option(ChannelOption.SO_BACKLOG, 1024)
		 .option(ChannelOption.SO_SNDBUF, 1*1024)
		 .option(ChannelOption.SO_RCVBUF, 1*1024)
		 .childHandler(new ChannelInitializer<SocketChannel>() {
			@Override
			protected void initChannel(SocketChannel sc) throws Exception {
				//设置定长字符串5个长度接收
				sc.pipeline().addLast(new FixedLengthFrameDecoder(5));
				//设置字符串形式的解码
				sc.pipeline().addLast(new StringDecoder());
				sc.pipeline().addLast(new ServerHandler());
			}
		});
		
		//4 绑定连接
		ChannelFuture cf = b.bind(8765).sync();
		
		//等待服务器监听端口关闭
		cf.channel().closeFuture().sync();
		pGroup.shutdownGracefully();
		cGroup.shutdownGracefully();
	}
	
	/*启动modbus数据交互线程*/
	@RequestMapping("/modbusRunServer.do")
	public void modbusRunServer(){
		//获取context域
		WebApplicationContext webApplicationContext = ContextLoader.getCurrentWebApplicationContext();
		ServletContext context = webApplicationContext.getServletContext();
		//判断一个modbus线程是否已启动
		if(null==context.getAttribute("192.168.200.142")){
			modbusDriverService.modbusDriver("192.168.200.142", 2);
			//判断标志是context中的这个变量
			context.setAttribute("192.168.200.142", "fire");
		}
	}
	
	/*modbus写入操作*/
	@RequestMapping("/modbusSetService.do")
	public void modbusSetService(@RequestBody pauset ps){
		try {
			//获取context域
			WebApplicationContext webApplicationContext = ContextLoader.getCurrentWebApplicationContext();
			ServletContext context = webApplicationContext.getServletContext();
			//调试打印
			if(null!=ps){
				System.out.println("接收到了一条设定数据: " + ps.toString());
			}
			//初始化设定数据容器
			StrBuilder sb = new StrBuilder();
			sb.append("");
			try {
				//获取到设定的数值
				Integer temset = ps.getTemset();
				Integer humset = ps.getHumset();
				Integer preset = ps.getPreset();
				String controlset = ps.getControlset();
				//将设定值数据拼接成格式化的字符串
				sb.append(temset.toString() + "&");
				sb.append(humset.toString() + "&");
				sb.append(preset.toString() + "&");
				sb.append(controlset);
			} catch (Exception e) {
				System.out.println("设定值转换错误");
				return;
			}
			//转换成功进入写入操作
			String stringSet = sb.toString();
			if (null != stringSet && !"".equals(stringSet)) {
				context.setAttribute("modbusSetData_XF1", stringSet);
			}
			//循环判断是否写入成功(可能会有线程安全问题!)
			while (true) {
				try {
					//循环获取设定状态返回值
					Object attribute = context.getAttribute("modbusSetDataBack_XF1");
					//有设定值转台返回值
					if (null != attribute) {
						String sfb = (String) attribute;
						if (null != sfb && !"".equals(sfb)) {
							//设定返回值与设定值一致就结束方法
							if (sfb.equals(stringSet)) {
								context.removeAttribute("modbusSetDataBack_XF1");
								System.out.println("写入数据成功: "+stringSet);
								return;
							} else {
								//否则就继续写入context域再次尝试写入设备
								context.setAttribute("modbusSetData_XF1", stringSet);
							}
						}
					}
				} catch (Exception e) {
					System.out.println("检查设定写入操作异常");
					return;
				}
			} 
		} catch (Exception e) {
			System.out.println("设定写入操作异常");
		}
	}

}
