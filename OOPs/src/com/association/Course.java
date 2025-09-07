package com.association;

public class Course {
	private int courseId;
	private String courseName;

	public int getCourseId() {
		return courseId;
	}

	public Course(int courseId, String courseName) {
		super();  //it calls the parent class that is object class if we remove super() class it works fine
		this.courseId = courseId;
		this.courseName = courseName;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
