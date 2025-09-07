package com.collection1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springConfig.xml");
		Student bean = ctx.getBean("stu", Student.class);
		System.out.println(bean);
	}
}