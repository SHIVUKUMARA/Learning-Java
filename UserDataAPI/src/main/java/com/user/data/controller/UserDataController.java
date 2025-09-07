package com.user.data.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.data.model.UserData;
import com.user.data.service.UserDataService;

@RestController
@RequestMapping("/userdata")
public class UserDataController {

	UserDataService userDataService;

	public UserDataController() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/userId")
	public Object getUserData(@PathVariable String userId){
		return userDataService.getUserData(userId);
	}
	
	@GetMapping()
	public List<UserData> getAllUserData(){
		return userDataService.getAllUserData();
	}
	
	@PostMapping("/create")
	public String createUserData(@RequestBody UserData userData) {
		userDataService.createUserData(userData);
		return "User Details are stored Successfully";
	}
}
