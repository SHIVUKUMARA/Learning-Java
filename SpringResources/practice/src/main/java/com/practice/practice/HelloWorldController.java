package com.practice.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String sayHello() {
        String msg = "Hello, World!";
        System.out.println(msg);
        return msg;
    }
    
    @GetMapping("/bye")
    public String sayBye() {
    	String msg1 = "Good Bye!";
    	System.out.println(msg1);
    	return msg1;
    }
}
