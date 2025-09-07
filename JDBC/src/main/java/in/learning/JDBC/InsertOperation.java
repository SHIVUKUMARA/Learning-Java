package in.learning.JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertOperation {

	private static Connection con;
	public static Connection getConnection() {
		con = ConfigurationFile.getConnection();
		return con;
	}
	
	public static void addProduct() throws SQLException {
		String sql = "insert into product(product_name, product_price, categoryName)"
	     +"values ('HP23', 78000, 'laptop'),('Lenovo', 90000, 'computer')";
		Statement stmt = getConnection().createStatement();
		int row = stmt.executeUpdate(sql);
		if(row > 0) {
			System.out.println("Product added Successfully");
		}else {
			System.out.println("Something went wrong!!!");
		}
	}
	
	public static void main(String[] args) throws SQLException{
		addProduct();

	}

}
