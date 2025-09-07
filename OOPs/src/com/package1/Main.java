package com.package1;

public class Main {
	
	public void getProductName(Product product) {
		//default
		System.out.println(product.productName);
		
		//public
		System.out.println(product.productId);
		
		//private - it does not allow in another class
		//System.out.println(product.category);
	}
	
	public static void getData(ChildClass obj1) {
		System.out.println(obj1.productPrice);
	}

	public static void main(String[] args) {
       Product product = new Product();
       System.out.println(product.productName);
       
       Main obj = new Main();
       obj.getProductName(product);
       
       ChildClass obj1 = new ChildClass();
       Main.getData(obj1);
	}

}
