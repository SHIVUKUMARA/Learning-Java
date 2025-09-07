package com.exception.try_catch;

public class Test3 {
    public static void m1() {
    	String obj = "Java";
    	try {
    		System.out.println(obj.charAt(4));
    	}catch(NullPointerException npe) {
    		System.out.println("Handled by the 1st catch block");
    	}catch(Exception ex) {
    		System.out.println("Handled by the 2nd catch block");
    	}
    	System.out.println("code completed");
    }
	public static void main(String[] args) {
       Test3.m1();
	}

}
