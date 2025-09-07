package in.learning.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConfigurationFile {

	private static Connection con = null;
	
	//url
	private static final String url = "jdbc:mysql://localhost:3306/jdbc_learning";
	
	//username
	private static final String username = "root";
	
	//password
	private static final String password = "shivu";
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			if(con == null) {
				con = DriverManager.getConnection(url, username, password);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public static void main(String[] args) {
		System.out.println(getConnection());

	}

}
