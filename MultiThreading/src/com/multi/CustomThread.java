package com.multi;

class A extends Thread{
	public void run() {
		System.out.println("Current thread inside run() method : "+ Thread.currentThread().getName() );
	}
}

class B implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

public class CustomThread {

	public static void main(String[] args) {

     //main thread
		System.out.println(Thread.currentThread().getName());
		
		//using thread class
		A a = new A();
		a.start();
		
		//using runable interface
		B b = new B();
		Thread t1 = new Thread(b);
		t1.start();

	}

}
