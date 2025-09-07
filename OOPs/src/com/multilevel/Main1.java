package com.multilevel;

class A{
	int a= 10;
	int b = 20; 
	int c;
	
	void add() {
		c = a+b;
		System.out.println(c);
	}
	
	void sub() {
		c = b-a;
		System.out.println(c);
	}
}

class B extends A{
	void mul() {
		c = a*b;
		System.out.println(c);
	}
	void div() {
		c = a/b;
		System.out.println(c);
	}
}

class C extends B{
	void rem() {
		c = a%b;
		System.out.println(c);
	}
}

class D extends C{
	void perform() {
		add();
		sub();
		mul();
		div();
		rem();
	}
}
public class Main1 {

	public static void main(String[] args) {
		D obj = new D();
		obj.perform();
	}

}
