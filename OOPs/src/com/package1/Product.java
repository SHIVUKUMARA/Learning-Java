package com.package1;

public class Product {
	
	//default access-modifier
   String productName = "Samsung";
   
   //public access modifier
   public int productId = 1234;
   
   //private access modifier
   private static String category = "Mobile";
   public static String get() {
	   return category;
   }
   
   //protected access modifier
   protected double productPrice = 90000;
}
