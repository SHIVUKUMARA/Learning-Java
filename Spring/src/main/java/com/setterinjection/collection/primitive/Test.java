package com.setterinjection.collection.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springConfig.xml");
		Product bean = ctx.getBean("product", Product.class);
        System.out.println(bean);
	}

}
