package com.ecommerce.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConfigurationFile {

	private static Connection con = null;

	private static final String url = "jdbc:mysql://localhost:3306/ecommerce";

	private static final String username = "root";

	private static final String password = "shivu";

	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			if (con == null) {
				con = DriverManager.getConnection(url, username, password);
			}
		} catch (Exception e) {
			 System.err.println("MySQL Driver not found.");
			e.printStackTrace();
		}
		return con;
	}

	public static void main(String[] args) {
       System.out.println(getConnection());
	}
}
