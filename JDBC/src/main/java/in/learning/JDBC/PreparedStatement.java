package in.learning.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class DBOperation {
	private static final String url = "jdbc:mysql://localhost:3306/jdbc_learning";
	private static final String username = "root";
	private static final String password = "shivu";
	private static Connection con = null;
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			if(con == null) {
				con = DriverManager.getConnection(url, username, password);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public static void addEmployee(Scanner sc) throws SQLException {
		System.out.println("Enter the name of employee: ");
		String empName = sc.nextLine();
		System.out.println("Enter the deptName: ");
		String dept = sc.nextLine();
		System.out.println("Enter the salary: ");
		int salary = sc.nextInt();
		
		java.sql.PreparedStatement ps = getConnection().prepareStatement("INSERT INTO employee (empName, dept, salary) VALUES (?, ?, ?)");
		ps.setString(1, empName);
		ps.setString(2, dept);
		ps.setInt(3, salary);
		
		ps.executeUpdate();
		System.out.println("Employee added successfully");
	}
	
	public static void getEmployee() throws SQLException {
		String sql = "SELECT * FROM employee";
		Statement stmt = getConnection().createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		System.out.println("Employee details: ");
		System.out.println("----------------------------------------");
		while(rs.next()) {
			System.out.println("employeeId: " + rs.getInt(1));
			System.out.println("empName: " + rs.getString(2));
			System.out.println("empDept: " + rs.getString(3));
			System.out.println("salary: " + rs.getDouble(4));
		}
	}
	
	public static void updateEmployee(Scanner sc) throws SQLException {
		System.out.println("Enter employee id: ");
		int empId = sc.nextInt();
		System.out.println("Enter the salary to update: ");
		int updatedSalary = sc.nextInt();
		
		java.sql.PreparedStatement ps = getConnection().prepareStatement("UPDATE employee SET salary = ? WHERE empId = ?");
		ps.setInt(1, updatedSalary);
		ps.setInt(2, empId);
		
		int rowsAffected = ps.executeUpdate();
		if (rowsAffected > 0) {
			System.out.println("Employee updated successfully");
		} else {
			System.out.println("Employee not found");
		}
	}
	
	public static void getEmployeeById(Scanner sc) throws SQLException {
		System.out.println("Enter employee id: ");
		int empId = sc.nextInt();
		
		java.sql.PreparedStatement ps = getConnection().prepareStatement("SELECT * FROM employee WHERE empId = ?");
		ps.setInt(1, empId);
		ResultSet rs = ps.executeQuery();
		System.out.println("Employee details: ");
		System.out.println("----------------------------------------");
		if(rs.next()) {
			System.out.println("employeeId: " + rs.getInt(1));
			System.out.println("empName: " + rs.getString(2));
			System.out.println("empDept: " + rs.getString(3));
			System.out.println("salary: " + rs.getDouble(4));
		} else {
			System.out.println("Employee not found");
		}
	}
	
	public static void deleteEmployee(Scanner sc) throws SQLException {
	    System.out.println("Enter employee id to delete: ");
	    int empId = sc.nextInt();
	    
	    java.sql.PreparedStatement ps = getConnection().prepareStatement("DELETE FROM employee WHERE empId = ?");
	    ps.setInt(1, empId);
	    
	    int rowsAffected = ps.executeUpdate();
	    if (rowsAffected > 0) {
	        System.out.println("Employee deleted successfully");
	    } else {
	        System.out.println("Employee not found");
	    }
	}
}

public class PreparedStatement {  
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		DBOperation.addEmployee(sc);
		DBOperation.getEmployee();
		DBOperation.getEmployeeById(sc);
		DBOperation.updateEmployee(sc);
		DBOperation.deleteEmployee(sc);
	}
}
