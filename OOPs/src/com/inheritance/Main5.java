package com.inheritance;

class M{
		int m = 10;
}

class N extends M{
	int m = 20;
	public void getM() {
		int m = 30;
		System.out.println(m);
		System.out.println(this.m);
		System.out.println(super.m);
	}
}

public class Main5 {

	public static void main(String[] args) {
		N obj = new N();
		obj.getM();
	}

}
