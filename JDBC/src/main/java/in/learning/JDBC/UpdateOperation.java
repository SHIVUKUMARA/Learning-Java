package in.learning.JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateOperation {

    private static Connection con;

    public static Connection getConnection() {
        con = ConfigurationFile.getConnection();
        return con;
    }

    public static void updateProduct() throws SQLException {
        String sql = "UPDATE product SET product_price = 43000 WHERE product_id = 1";
        Statement stmt = getConnection().createStatement();
        int rowsAffected = stmt.executeUpdate(sql);
        System.out.println("Rows affected: " + rowsAffected);
    }
    
    public static void readProduct() throws SQLException {
		String sql = "select * from product";
		Statement stmt = ConfigurationFile.getConnection().createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.println("Product_id:"+ rs.getInt(1));
			System.out.println("Produc_name:"+ rs.getString(2));
			System.out.println("Product_price:"+ rs.getDouble(3));
			System.out.println("categoryName:"+ rs.getString(4));
			System.out.println("----------------------------------------------------------");
		}
	}

    public static void main(String[] args) throws SQLException {
        updateProduct();
        readProduct();
    }
}
