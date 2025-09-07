package com.multi;

class Print{
	public static void m1(int num) {
		System.out.println(num);
	}
}

class T1 extends Thread{
	public void run() {
		Print.m1(2);
		System.out.println();
	}
}

class T2 extends Thread{
	public void run() {
		Print.m1(3);
	}
}
public class Test1 {

	public static void main(String[] args) {
		Print p = new Print();


	}

}
