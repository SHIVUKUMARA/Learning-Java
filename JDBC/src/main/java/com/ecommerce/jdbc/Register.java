package com.ecommerce.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Register {

	private static Connection con;

	private static Connection getConnection() {
		con = ConfigurationFile.getConnection();
		return con;
	}

	public static void UserTable() throws SQLException {
		String sql = "create table if not exists user (" + "user_Id int auto_increment primary key,"
				+ "userName varchar(100) not null," + "Email varchar(100) not null unique,"
				+ "password varchar(100) not null," + "status ENUM('active', 'inactive') DEFAULT 'inactive'" + ")";

		Statement stmt = getConnection().createStatement();
		int rs = stmt.executeUpdate(sql);
		System.out.println("Table created successfully");
	}

	public static boolean isEmailExists(String Email) throws SQLException {
		String sql = "select * from user where email = ?";
		PreparedStatement stmt = getConnection().prepareStatement(sql);
		stmt.setString(1, Email);
		ResultSet rs = stmt.executeQuery();
		return rs.next();
	}

	public static void Register(Scanner sc) throws SQLException, InterruptedException {
		String sql = "insert into user(userName, Email, password) values(?,?,?)";

		String userName;
		String Email;
		String Password;

		while (true) {
			System.out.print("Enter the UserName: ");
			userName = sc.nextLine().trim();
			if (!userName.isEmpty()) {
				break;
			}
			System.out.println("UserName can't be empty!!!");
		}

		while (true) {
			System.out.print("Enter the Email: ");
			Email = sc.nextLine().trim();
			if (!Email.isEmpty()) {
				break;
			}
			System.out.println("Email can't be empty!!!");
		}

		while (true) {
			System.out.print("Set the Password: ");
			Password = sc.nextLine();
			if (!Password.isEmpty()) {
				break;
			}
			System.out.println("Password can't be empty!!!");
		}

		if (isEmailExists(Email)) {
			System.out.println("Email already Registered. Try using another Email");
			return;
		}

		PreparedStatement stmt = getConnection().prepareStatement(sql);
		stmt.setString(1, userName);
		stmt.setString(2, Email);
		stmt.setString(3, Password);
		stmt.setString(4, "inactive");

		int rs = stmt.executeUpdate();
		if (rs > 0) {
			Thread.sleep(2000);
			System.out.println("user Registered successfully");
		} else {
			System.out.println("Registration failed. Please try again.");
		}
	}

	public static void main(String[] args) throws SQLException, InterruptedException {

		Scanner sc = new Scanner(System.in);
		UserTable();
		Register(sc);
	}

}
