package com.exception.try_catch;

public class Test2 {
    public static void m1() {
    	String str = null;
    	System.out.println(str.length());
    	try {
    		System.out.println("Hello");
    	}catch(NullPointerException npe) {
    		npe.printStackTrace();
    	}
    	System.out.println("Code completed");
    }
	
	public static void main(String[] args) {
       Test2.m1();
	}

}
