package in.learning.JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadOperation {
	
	public static void readProduct() throws SQLException {
		String sql = "select * from product";
		Statement stmt = ConfigurationFile.getConnection().createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.println("Product_id:"+ rs.getInt(1));
			System.out.println("Produc_name:"+ rs.getString(2));
			System.out.println("Product_price:"+ rs.getDouble(3));
			System.out.println("categoryName:"+ rs.getString(4));
		}
	}
	
	public static void id(int pid) throws SQLException{
		String sqlQ = "select * from product where product_id ="+ pid;
		Statement stmt = ConfigurationFile.getConnection().createStatement();
		ResultSet sr = stmt.executeQuery(sqlQ);
		while(sr.next()) {
			System.out.println("Product_id:"+ sr.getInt(1));
			System.out.println("Produc_name:"+ sr.getString(2));
			System.out.println("Product_price:"+ sr.getDouble(3));
			System.out.println("categoryName:"+ sr.getString(4));
		}
	}

	public static void main(String[] args) throws SQLException{
		readProduct();
        System.out.println("----------------------------------");
        id(1);
	}

}
