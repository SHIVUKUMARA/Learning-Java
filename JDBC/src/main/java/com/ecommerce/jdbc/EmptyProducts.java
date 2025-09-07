package com.ecommerce.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import in.learning.JDBC.ConfigurationFile;

public class EmptyProducts {

	private static Connection con;

	private static Connection getConnection() {
		con = ConfigurationFile.getConnection();
		return con;
	}

	public static void emptyProductTable() throws SQLException {
		String sql = "truncate table product";
		try (Connection con = getConnection(); Statement stmt = con.createStatement()) {
			stmt.executeUpdate(sql);
			System.out.println("Table has been reset successfully.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error occurred while truncating the table.");
		}
	}

	public static void main(String[] args) throws SQLException {

		emptyProductTable();
	}

}
