package com.collection1;

import java.util.List;

public class Student {

	private int stuId;
	private String stuName;
	private List<String> courses;
	public Student(int stuId, String stuName, List<String> courses) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", courses=" + courses + "]";
	}
	
	
}
