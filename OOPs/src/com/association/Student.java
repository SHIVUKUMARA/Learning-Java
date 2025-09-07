package com.association;

public class Student {
	private int studentId;
	private String studentName;
	private Course course;  //reference object
	
	public Student(int studentId, String studentName, Course course) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.course = course;
	}
	//setter and getter function
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
}
