package in.learning.JDBC;

import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessing {
	
	public static void dbOperation() throws SQLException{
		Statement stmt = DBOperation.getConnection().createStatement();
		String sql1 = "insert into employee(empName, dept, salary) values('ankit','dev',7000)";
		String sql2 = "insert into employee(empName, dept, salary) values('varun','dev',9900)";
		stmt.addBatch(sql1);
		stmt.addBatch(sql2);
		
		int[] rows = stmt.executeBatch();
		System.out.println(rows.length+" affected");
	}

	public static void main(String[] args) throws SQLException {
		dbOperation();

	}

}
