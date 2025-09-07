package com.learning.SpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@GetMapping("/")
	public String getUser(){
		return "Hello Shivu";
	}
	
	@GetMapping("/{username}")
	public String getUserByName(@PathVariable String username) {
		return "Hello "+ username;
	}
}
