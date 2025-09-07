package com.ecommerce.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CreateProduct {

	private static Connection con;

	public static Connection getConnection() {
		con = ConfigurationFile.getConnection();
		return con;
	}

	public static void createproductTable() throws SQLException {
		String sql = "create table if not exists product (" + "product_Id int auto_increment primary key,"
				+ "product_Name varchar(100) not null," + "product_Price decimal(10,2) not null,"
				+ "product_Category varchar(100) not null," + "product_Quantity int not null"+")";
		
		Statement stmt = getConnection().createStatement();
		stmt.executeUpdate(sql);
		System.out.println("Product Table created Successfully");
	}
	
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
	

	public static void main(String[] args) throws SQLException {

		Scanner sc = new Scanner(System.in);
		createproductTable();
		insertproductTable(sc);
	}

}
