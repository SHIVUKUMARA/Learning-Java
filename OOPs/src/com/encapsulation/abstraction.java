package com.encapsulation;

abstract class A{
	public abstract void m1();   //abstract method
	public void m2() {    // concrete method
		
	}
}

class B extends A{
	@Override
	public void m1() {
		
	}
}

public class abstraction {

	public static void main(String[] args) {
//      A a = new A();  //for abstract method it is not possible to create object
	}

}
