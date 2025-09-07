package com.user.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class UserData {

	@Id
	private int userId;
	private String userName;
	private String userEmail;
	private int userAge;
	private String userOccupation;
	private String userCompany;
	private String userAddress;
	private int userSalary;
	private int userPh;
	
	public UserData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserData(int userId, String userName, String userEmail, int userAge, String userOccupation,
			String userCompany, String userAddress, int userSalary, int userPh) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userAge = userAge;
		this.userOccupation = userOccupation;
		this.userCompany = userCompany;
		this.userAddress = userAddress;
		this.userSalary = userSalary;
		this.userPh = userPh;
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

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getUserOccupation() {
		return userOccupation;
	}

	public void setUserOccupation(String userOccupation) {
		this.userOccupation = userOccupation;
	}

	public String getUserCompany() {
		return userCompany;
	}

	public void setUserCompany(String userCompany) {
		this.userCompany = userCompany;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public int getUserSalary() {
		return userSalary;
	}

	public void setUserSalary(int userSalary) {
		this.userSalary = userSalary;
	}

	public int getUserPh() {
		return userPh;
	}

	public void setUserPh(int userPh) {
		this.userPh = userPh;
	}
}
