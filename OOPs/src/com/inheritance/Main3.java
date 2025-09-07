package com.inheritance;


class x{
	x(){
		System.out.println("Parent class constructor");
	}
}

class y extends x{
	y(){
		
		//super();  constructor must be called at first line we can't use both super() and this() keyword
		this(10); 
		System.out.println("Child class constructor");
	}
	
	y(int a){
		System.out.println("One-arg constructor");
	}
}
public class Main3 {

	public static void main(String[] args) {
		y obj = new y();
	}

}
