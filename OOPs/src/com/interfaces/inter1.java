package com.interfaces;

interface A { // declare interface
	// abstract methods: without function body
	void m1();

	void m6();

	void m2();

	void m3();
	
	public default void m4() {
		System.out.println("Default method");
	}
	
	public static void m5() {
		System.out.println("static method");
	}
}

interface Z{
	
}

interface B extends A,Z{
	void m6();
}
class AImpl implements A {

	@Override
	public void m1() {
		System.out.println("m1() called");
	}

	@Override
	public void m2() {
		System.out.println("m2() called");

	}

	@Override
	public void m3() {
		System.out.println("m3() called");

	}
	
	@Override
	public void m6() {
		System.out.println("m6() called");

	}

}

public class inter1 {

	public static void main(String[] args) {

		AImpl a = new AImpl();
		a.m1();
		a.m2();
		a.m3();
		a.m4();  //default method
		A.m5();  //static method : can be called by interface name.method name
		a.m6();
	}

}
