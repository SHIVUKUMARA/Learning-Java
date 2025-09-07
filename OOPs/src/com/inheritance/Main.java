package com.inheritance;

class Parent {
	int a = 10;
	public int b = 20;
	protected int c = 30;
	private int d = 40;
	
	//getter : method to access private data
	public int getD() {
		return this.d;
	}
}

class Child extends Parent{
	public int getPrivateData() {
		return this.getD();
	}
}

public class Main {

	public static void main(String[] args) {
       Child ch = new Child();
       System.out.println(ch.a+" "+ch.b+" "+ch.c);
       System.out.println(ch.getD());
       System.out.println(ch.getPrivateData());
	}

}
