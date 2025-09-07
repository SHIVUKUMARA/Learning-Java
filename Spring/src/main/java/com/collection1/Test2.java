package com.collection1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springConfig.xml");
		Job bean = ctx.getBean("job", Job.class);
		System.out.println(bean);
	}

}
