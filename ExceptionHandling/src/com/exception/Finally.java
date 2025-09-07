package com.exception;

//code can be executed finally 100% wheter exception is handled or not
public class Finally {

	public static void m1(int n1, int n2) {
		try {
			int result = n1/n2;
			System.out.println(result);
//			System.exit(0);  //exit from entire method and not reach finally block
		}catch(Exception e) {
			System.out.println("Exception handled inside catch block");
			System.exit(-1);
		}finally {
			System.out.println("Finally block is executed");
		}
	}
	
	public static void main(String[] args) {
		
		m1(12, 3);
		m1(12, 0);
	}

}
