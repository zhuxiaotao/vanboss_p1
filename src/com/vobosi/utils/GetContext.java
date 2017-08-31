package com.vobosi.utils;

import javax.servlet.ServletContext;

import org.springframework.web.context.ServletContextAware;

public class GetContext implements ServletContextAware{
	private ServletContext c;
	@Override
	public void setServletContext(ServletContext Context) {
		this.c=Context;
		System.out.println("获取的context域对象为： "+c.toString());
	}
	//获取Context
	public ServletContext getContext(){
		
		return c;
	}

}
