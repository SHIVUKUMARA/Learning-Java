package com.exception;

class StudentNotFoundException extends Exception{
   	
}

public class Throws {
     
	public static void findById(int Id) throws StudentNotFoundException{
		if(Id == 100) {
			throw new StudentNotFoundException();
		}else {
			System.out.println("Student Found");
		}
	}
	
	public static void main(String[] args) {
       try {
    	   findById(100);
       }catch(Exception e) {
    	   System.out.println("Exception handled inside main method");
       }
	}
}
