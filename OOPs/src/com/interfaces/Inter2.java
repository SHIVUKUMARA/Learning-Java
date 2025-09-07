package com.interfaces;

//class X{
//	public void m1() {
//		System.out.println("m1() from X");
//	}
//}

interface X{
	void m1();
}

interface Y {
	void m1();
}

class C implements X,Y{

	@Override
	public void m1() {
       System.out.println("m1() called from X and Y, but over written by Y");		
	}
	
}

public class Inter2 {

	public static void main(String[] args) {
       C c = new C();
       c.m1();
	}

}
