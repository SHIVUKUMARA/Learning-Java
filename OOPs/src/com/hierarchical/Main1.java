package com.hierarchical;


class A{
	int a = 10;
}

class B extends A{
	int c1 = 20;
	void add1() {
		int c = a + c1;
		System.out.println(c);
	}
}

class C extends B{
	int c2 = 30;
	void add2() {
		int c = a + c2;
		System.out.println(c);
	}
}

class D extends A{
	int c3 = 40;
	void add3() {
		int c = a + c3;
		System.out.println(c);
	}
	
	C c = new C();
	B b = new B();
	
	void perform() {
		b.add1();
		c.add2();
		add3();
	}
}


public class Main1 {

	public static void main(String[] args) {
       D obj = new D();
       obj.perform();
	}

}
