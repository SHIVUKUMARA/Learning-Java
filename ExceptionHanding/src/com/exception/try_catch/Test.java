package com.exception.try_catch;
//try-catch, try-finally or try-catch-finally
public class Test {
   public static void m1() {
	   String str = null;
	   try {
	   System.out.println(str.length());
	   }catch(NullPointerException npe) {
		   System.out.println("Can't find length of object");
		   npe.printStackTrace();
	   }
	   System.out.println("Code Completed");
   }
   
   
	public static void main(String[] args) {
       Test.m1();
	}

}
