package com.ecommerce.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetProducts {

	private static Connection con;
	public static Connection getConnection() {
		con = ConfigurationFile.getConnection();
		return con;
	}
	
	public static void getProducts() throws SQLException {
		String sql = "select * from product";
		Statement stmt = getConnection().createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		System.out.println("Product Details: \n-------------------------------------------------");
		while(rs.next()) {
			System.out.println("product_Id       :"+rs.getInt(1));
			System.out.println("product_Name     :"+rs.getString(2));
			System.out.println("product_Price    :"+rs.getInt(3));
			System.out.println("product_Category :"+rs.getString(4));
			System.out.println("poroduct_Quantity:"+rs.getInt(5));
			System.out.println("----------------------------------------------------");
		}
	}
	
	public static void main(String[] args) throws SQLException {

		getProducts();
	}

}
