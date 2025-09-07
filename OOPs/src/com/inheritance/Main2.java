package com.inheritance;


class A{
	A(){
		System.out.println("A class constructor");
	}
}

class B extends A{
	B(){
		System.out.println("B class constructor");
	}
}

public class Main2 {

	public static void main(String[] args) {
       B b = new B();
	}

}
