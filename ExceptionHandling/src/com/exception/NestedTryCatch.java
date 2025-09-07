package com.exception;

public class NestedTryCatch {
    public static void m1() {
    	try {
    		String str = "Java";
    		System.out.println(str.length());
    		try {
    			int num = 12/0;
    			System.out.println(num);
    		}
//    		catch(ArithmeticException ae) {
//    			System.out.println("Exception handled by inner catch block");
//    		}
    		catch(NullPointerException npe) {
    			System.out.println("Exception handled by inner catch block");
    		}
    	}catch(Exception e) {
    		System.out.println("Exception handled by outer catch block");
    	}
//    	catch(ArrayIndexOutOfBoundsException e) {
//    		System.out.println("Exception handled by outer catch block");
//    	}
    }
	public static void main(String[] args) {
        m1();
	}

}
