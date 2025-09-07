package com.ecommerce.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteProduct {

	private static Connection con;

	public static Connection getConnection() {
		con = ConfigurationFile.getConnection();
		return con;
	}

	public static void deleteProduct(Scanner sc) throws SQLException {
	    System.out.println("Enter the product_Id: ");
	    int product_Id = sc.nextInt();
	    
	    Connection con = getConnection();
	    con.setAutoCommit(false);

	    try {
	        PreparedStatement deleteFromCart = con.prepareStatement("delete from cart where product_Id = ?");
	        deleteFromCart.setInt(1, product_Id);
	        deleteFromCart.executeUpdate();

	        PreparedStatement deleteProductStmt = con.prepareStatement("delete from product where product_Id = ?");
	        deleteProductStmt.setInt(1, product_Id);

	        int row = deleteProductStmt.executeUpdate();
	        if (row > 0) {
	            System.out.println("Product deleted Successfully");
	            con.commit();
	        } else {
	            System.out.println("Something went Wrong!!!");
	            con.rollback();
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	        con.rollback();
	    } finally {
	        con.setAutoCommit(true);
	    }
	}


	public static void main(String[] args) throws SQLException {

		Scanner sc = new Scanner(System.in);
		deleteProduct(sc);
	}

}
