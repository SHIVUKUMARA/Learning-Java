package com.association;

public class Main {

	public static void main(String[] args) {
       Course c1 = new Course(21, "Java");
       Student s1 = new Student(101, "Harsha", c1);
       
       System.out.println(s1.getStudentId());
       System.out.println(s1.getStudentName());
       System.out.println(s1.getCourse().getCourseId());
       System.out.println(s1.getCourse().getCourseName());
	}

}
