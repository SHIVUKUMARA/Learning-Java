package com.constructorinjection.primitive;

public class Employee {

	private int empId;
	private String empName;
	private String deptName;
	public Employee(int empId, String empName, String deptName) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", deptName=" + deptName + "]";
	}
}
