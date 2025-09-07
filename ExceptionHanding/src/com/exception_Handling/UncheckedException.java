package com.exception_Handling;

public class UncheckedException {
   public static void arithmeticExceptionMethod() {
	   int num = 12/0;
	   System.out.println(num);
   }
   
   public static void nullPointerExceptionMethod() {
	   String str = null;
	   System.out.println(str.length());
   }
   
   public static void numberFormatExceptionMethod() {
	   String str = "123b";
	   System.out.println(Integer.parseInt(str));
   }
   
   public static void arrayIndexExceptionMethod() {
	   int[] arr = {1, 2, 3};
	   System.out.println(arr[4]);
   }
   
   public static void stringIndexExceptionMethod() {
	   String str = "abc";
	   System.out.println(str.charAt(3));
   }
	public static void main(String[] args) {
//		UncheckedException.arithmeticExceptionMethod();
//		UncheckedException.nullPointerExceptionMethod();
//		UncheckedException.numberFormatExceptionMethod();
//		UncheckedException.arrayIndexExceptionMethod();
		UncheckedException.stringIndexExceptionMethod();
	}

}
