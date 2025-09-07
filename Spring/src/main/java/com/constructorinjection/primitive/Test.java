package com.constructorinjection.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springConfig.xml");
		Employee bean = ctx.getBean("emp", Employee.class);
		System.out.println(bean);
	}

}
