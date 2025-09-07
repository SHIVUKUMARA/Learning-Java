package com.flightbooking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserUtil {

	private static Connection con = null;
	
	public static void registration(Scanner sc) throws ClassNotFoundException, SQLException{
		con = DBConfiguration.getConnection();
		System.out.print("Enter the username: ");
		String username = sc.next();
		System.out.print("Enter the password: ");
		String password = sc.next();
		
		PreparedStatement stmt = con.prepareStatement("insert into user(username, password) values(?, ?)");
		stmt.setString(1, username);
		stmt.setString(2, password);
		int i = stmt.executeUpdate();
		if(i > 0) {
			System.out.println("Registration Successfull");
		}
	}

	public static LoginResponse login(Scanner sc) throws ClassNotFoundException, SQLException{
		System.out.println("Enter the login credentials to proceed...");
		LoginResponse obj = new LoginResponse();
		Connection con = DBConfiguration.getConnection();
		System.out.print("Enter the username: ");
		String username = sc.next();
		System.out.print("Enter the password: ");
		String password = sc.next();
		
		PreparedStatement ps = con.prepareStatement("select * from user where username = ?");
		ps.setString(1, username);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			if(rs.getString(3).equals(password)) {
				obj.setUsername(username);
				obj.setStatus(true);
				break;
			}
		}
		return obj;
	}
}