package com.package2;
import com.package1.Product;

public class Main {

	public static void getProductName(Product product) {
		// can't be accessed outside the package
		//System.out.println(product.productName);  
		
		
		//public access modifier allows access in different packages
		System.out.println(product.productId);
		
		//protected - outside the package it is not accessible
		//System.out.println(product.productPrice);
	}

	public static void main(String[] args) {
		 Product product = new Product();
	       Main.getProductName(product);
	}

}
