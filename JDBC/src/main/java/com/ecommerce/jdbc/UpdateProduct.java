package com.ecommerce.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateProduct {

	private static Connection con;

	public static Connection getConnection() {
		con = ConfigurationFile.getConnection();
		return con;
	}

	public static void updateProducts(Scanner sc) throws SQLException {
		System.out.print("Enter the product id: ");
		int product_Id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the new product name: ");
		String product_Name = sc.nextLine();
		System.out.print("Enter the new product price: ");
		int product_Price = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the new product category: ");
		String product_Category = sc.nextLine();
		System.out.print("Enter the product quantity: ");
		int product_Quantity = sc.nextInt();

		PreparedStatement stmt = getConnection().prepareStatement(
				"update product set product_Name = ?, product_Price = ?, product_Category = ?, product_Quantity = ? where product_Id = ?");
		
		stmt.setString(1, product_Name);
		stmt.setInt(2, product_Price);
		stmt.setString(3, product_Category);
		stmt.setInt(4, product_Quantity);
		stmt.setInt(5, product_Id);
		
		int row = stmt.executeUpdate();
		if(row > 0) {
			System.out.println("Product updated Successfully");
		}else {
			System.out.println("Something went Wrong!!!");
		}
	}

	public static void main(String[] args) throws SQLException {

		Scanner sc = new Scanner(System.in);
		updateProducts(sc);
	}

}
