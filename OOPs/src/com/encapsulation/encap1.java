package com.encapsulation;

class User {
	private int userId = 100;   //to provide security add final keyword to all variables
	private String userName = "Shivu";
	private String userPwd = "abcabc";

	public User() {
		super();
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
}

public class encap1 {

	public static void main(String[] args) {
        User user = new User();
        System.out.println(user.getUserId()+" "+user.getUserName()+" "+user.getUserPwd());
        
        user.setUserId(101);
        user.setUserName("Varun");
        user.setUserPwd("abc123");
        
        System.out.println(user.getUserId()+" "+user.getUserName()+" "+user.getUserPwd());
	}

}
