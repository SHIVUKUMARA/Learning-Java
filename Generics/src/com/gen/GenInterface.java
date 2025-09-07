package com.gen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	private int studentId;
	private String  studentName;
	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	@Override
	public int compareTo(Student obj) {
		return this.studentName.compareTo(obj.studentName);
	}
}

public class GenInterface {

	public static void main(String[] args) {
        Student s1 = new Student(101, "Harsha");
        Student s2 = new Student(102, "Amith");
        Student s3 = new Student(103, "Bharath");
        
        List<Student> list = Arrays.asList(s1, s2, s3);
        System.out.println(list);
        System.out.println("----------------------------------------------------------------");
        Collections.sort(list);
        System.out.println(list);
	}

}
