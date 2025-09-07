package com.ecommerce.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GetItemsByCategory {

	private static Connection con;
	private static Connection getConnection() {
		con = ConfigurationFile.getConnection();
		return con;
	}
	
	public static void getItemByCategory(Scanner sc) throws SQLException {
		
		System.out.print("Enter the category: ");
		String product_Category = sc.nextLine();

		PreparedStatement stmt = getConnection().prepareStatement("select * from product where product_category = ?");
		stmt.setString(1,product_Category);
		ResultSet rs = stmt.executeQuery();
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
		Scanner sc = new Scanner(System.in);
		getItemByCategory(sc);
	}

}
