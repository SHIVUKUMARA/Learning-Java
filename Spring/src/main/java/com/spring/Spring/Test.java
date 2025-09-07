package com.spring.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
//		Greeting greeting = new Greeting();
//		String msg = greeting.greet();
//		System.out.println(msg);
		
		// getting instance of IoC Container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springConfig.xml");
		Greeting bean = ctx.getBean("greetingBean",Greeting.class);
//		String greet = bean.greet();
//		System.out.println(greet);

	}

}
