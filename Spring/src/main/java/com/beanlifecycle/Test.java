package com.beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("springConfig.xml");
		Box bean = ctx.getBean("box", Box.class);
		System.out.println("Box name is: "+bean.getBoxName());
		ctx.registerShutdownHook();
	}

}
