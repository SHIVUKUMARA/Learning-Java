package com.ecommerce.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class GetProductById {

	private static Connection con;
	private static Connection getConnection() {
		con = ConfigurationFile.getConnection();
		return con;
	}
	
	public static void getProductById(Scanner sc) throws SQLException {
		System.out.println("Enter the product id: ");
		int product_Id = sc.nextInt();
		
		PreparedStatement stmt = getConnection().prepareStatement("select * from product where product_Id = ?");
		stmt.setInt(1, product_Id);
		ResultSet rs = stmt.executeQuery();
		System.out.println("Product Details: ");
		if(rs.next()) {
			System.out.println("product_Id       :"+rs.getInt(1));
			System.out.println("product_Name     :"+rs.getString(2));
			System.out.println("product_Price    :"+rs.getInt(3));
			System.out.println("product_Category :"+rs.getString(4));
			System.out.println("poroduct_Quantity:"+rs.getInt(5));
			System.out.println("----------------------------------------------------");
		}else {
			System.out.println("Product not found");
		}
	}
	
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		getProductById(sc);
	}

}
