package com.practice.practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public HelloWorldController helloWorldController() {
        return new HelloWorldController();
    }
}
