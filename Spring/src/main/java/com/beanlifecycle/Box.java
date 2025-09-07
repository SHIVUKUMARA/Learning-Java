package com.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Box implements InitializingBean, DisposableBean{

	public String boxName;

	public Box() {
		System.out.println("Bean Created");
	}

	public String getBoxName() {
		System.out.println("custom util method called");
		return boxName;
	}

	public void setBoxName(String boxName) {
		System.out.println("setter injection performed");
		this.boxName = boxName;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
//	public void init() {
//		System.out.println("custom init() method called");
//	}
//	
//	public void destroy() {
//		System.out.println("custom destroy() method called");
//	}
}
