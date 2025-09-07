package com.user.data.service;

import java.util.List;

import com.user.data.model.UserData;

public interface UserDataService {

	public String createUserData(UserData userData);
	public String updateUserData(UserData userData);
	public String deleteUserData(String userId);
	public UserData getUserData(String userId);
	public List<UserData> getAllUserData();
}
