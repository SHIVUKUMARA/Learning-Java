package com.constructorinjection.reference;

public class Student {

	private int stuId;
	private String stuName;

	private Course course;

	public Student(int stuId, String stuName, Course course) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", course=" + course + "]";
	}

}
