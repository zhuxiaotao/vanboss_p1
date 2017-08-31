package com.vobosi.service;

import javax.servlet.ServletContext;
import com.vobosi.Interface.DataEngineService;
import com.vobosi.utils.GetContext;

public class DataEngineServiceImpl extends Thread implements DataEngineService {
	// congtext域对象定义
	private ServletContext servletcontext;
	//测试用计数变量
	private Double count = 0d;
	// 循环采集的跳出变量
	private Boolean flag = true;
	public ServletContext getServletcontext() {
		return servletcontext;
	}
	public void setServletcontext(ServletContext servletcontext) {
		this.servletcontext = servletcontext;
	}
	public Double getCount() {
		return count;
	}
	public void setCount(Double count) {
		this.count = count;
	}

	// 基础版数据采集运行
	public void run() {
		while (true) {
			//该if内应为数据采集业务
			if (flag) {
				count++;
				servletcontext.setAttribute("mycount", count);
				Object mycount = servletcontext.getAttribute("mycount");
				System.out.println("mycount==> " + count.toString());
			}
			try {
				// 获取是否运行循环的变量
				Object attribute = servletcontext.getAttribute("flag");
				flag = (Boolean) attribute;
				if (null == flag) {
					servletcontext.setAttribute("flag", true);
					flag = true;
				}
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
