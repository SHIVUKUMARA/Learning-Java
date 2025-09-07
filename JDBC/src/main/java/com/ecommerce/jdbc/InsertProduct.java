package com.ecommerce.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertProduct {

	private static Connection con;

	public static Connection getConnection() {
		con = ConfigurationFile.getConnection();
		return con;
	}

//	public static void insertproductTable() throws SQLException {
//		String sql = "insert into product(product_Name, product_Price, product_Category, product_Quantity)"
//				+ "values('HP23', 60000, 'Electronics', 6),('HP24', 65000, 'Electronics', 8)";
//		Statement stmt = getConnection().createStatement();
//		int row = stmt.executeUpdate(sql);
//		if(row > 0) {
//			System.out.println("Products added successfully");
//		}else {
//			System.out.println("Something went Wrong!!!");
//		}
//	}

	public static void insertproductTable(Scanner sc) throws SQLException {
		System.out.print("Enter the product name: ");
		String product_Name = sc.nextLine();
		System.out.print("Enter the product price: ");
		int product_Price = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the product category: ");
		String product_Category = sc.nextLine();
		System.out.print("Enter the product quantity: ");
		int product_Quantity = sc.nextInt();

		PreparedStatement stmt = getConnection()
				.prepareStatement("insert into product(product_Name, product_Price, product_Category, product_Quantity) values(?,?,?,?)");
		stmt.setString(1,product_Name);
		stmt.setInt(2, product_Price);
		stmt.setString(3, product_Category);
		stmt.setInt(4, product_Quantity);
		
		stmt.executeUpdate();
		System.out.println("Products added successfully");
	}
	
	public static void Main(String args[]) throws SQLException {
		Scanner sc = new Scanner(System.in);
		insertproductTable(sc);
	}
}
