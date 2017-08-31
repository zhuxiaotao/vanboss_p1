package com.vobosi.service;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import com.vobosi.Interface.modbusDriverService;
import com.vobosi.dao.pau.paustatusDao;
import com.vobosi.utils.modbus_thread;
/**
 * modbus驱动的服务层
 * @author zxt
 *
 */
@Service("modbusDriverService")
public class modbusDriverImpl implements modbusDriverService{
	//此处注入了新风机组的pojo
	@Autowired
	private paustatusDao paustatusDao;
	/**
	 * 此处传入modbus的ip及id
	 */
	@Override
	public void modbusDriver(String ip, Integer id) {
		try {
			//获取servletcontext域
			WebApplicationContext webApplicationContext = ContextLoader.getCurrentWebApplicationContext();
			ServletContext servletContext = webApplicationContext.getServletContext();
			//创建两个modbus数据交互线程
			modbus_thread mt1 = new modbus_thread(ip,id,servletContext,paustatusDao);
			Thread t1 = new Thread(mt1, "modbus_"+ip+"_"+id);
			//启动modbus数据交互线程
			t1.start();
			
		} catch (Exception e) {
			System.out.println("modbus驱动线程创建异常"+e.getMessage());
		}
	}

}
