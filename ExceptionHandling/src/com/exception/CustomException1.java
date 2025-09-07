package com.exception;

class StudentIdVerificationFailedException extends Exception{
	private String msg;
	public StudentIdVerificationFailedException(String msg) {
		this.msg = msg;
	}
	
	public String getErrorMessage() {
		return this.msg;
	}
}

public class CustomException1 {

	public static void college(int Id) {
		if(Id >= 100) {
			try {
				throw new StudentIdVerificationFailedException("Student Id Not Found!!!");
			}catch(StudentIdVerificationFailedException a) {
				System.out.println(a.getErrorMessage());
			}
		}
		else {
			System.out.println("Welcome to the college");
		}
	}
	
	public static void main(String[] args) {
	
		college(99);
	}

}
