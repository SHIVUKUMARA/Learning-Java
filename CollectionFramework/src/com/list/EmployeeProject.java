package com.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Employee {
	private int employeeId;
	private String employeeName;
	private int yearOfService;
	private int salary;

	Employee(int employeeId, String employeeName, int yearOfService, int salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.yearOfService = yearOfService;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getYearOfService() {
		return yearOfService;
	}

	public void setYearOfService(int yearOfService) {
		this.yearOfService = yearOfService;
	}
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", yearOfService="
				+ yearOfService + ", salary=" + salary + "]";
	}
	
	
}

public class EmployeeProject {
	
	public static List<Employee> getEmployee(List<Employee> list) {
		List<Employee> result = new ArrayList<>();
		for(Employee obj : list) {
			if(obj.getYearOfService() >= 5) {
				obj.setSalary((int)(obj.getSalary()+obj.getSalary()*0.15));
				result.add(obj);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		
		Employee employee1 = new Employee(101, "Sujan", 5, 1000);
		Employee employee2 = new Employee(102, "Ullas", 4, 2000);
		Employee employee3 = new Employee(103, "Shivu", 8, 3000);
		
//		List<Employee> list = new ArrayList<>();
//		list.add(employee1);
//		list.add(employee2);
//		list.add(employee3);
		
		List<Employee> list = Arrays.asList(employee1, employee2, employee3);
		System.out.println(getEmployee(list));
		

	}

}