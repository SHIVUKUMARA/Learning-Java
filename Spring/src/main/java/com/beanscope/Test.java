package com.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springConfig.xml");
		Vehicle bean = ctx.getBean("vehicle", Vehicle.class);
		Vehicle bean2 = ctx.getBean("vehicle", Vehicle.class);
//		Vehicle bean2 = ctx.getBean("vehicle2", Vehicle.class);

        
        if(bean==bean2) {
        	System.out.println("Points to same bean");
        }else {
        	System.out.println("Points to different beans");
        }
	}

}
