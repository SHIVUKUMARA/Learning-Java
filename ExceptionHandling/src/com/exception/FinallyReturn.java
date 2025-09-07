package com.exception;

public class FinallyReturn {

	public static int m1(int n1, int n2) {
		try {
			int result = n1/n2;
			return 0;
		}catch(Exception e) {
			return -1;
		}finally {
			return -2;
//			System.out.println("Finally block is executed");
		}
	}
	
	public static void main(String[] args) {

		System.out.println(m1(12, 0));
	}

}
