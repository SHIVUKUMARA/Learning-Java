package com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springConfig.xml");
		Category bean = ctx.getBean("category", Category.class);
		System.out.println(bean);
	}
}