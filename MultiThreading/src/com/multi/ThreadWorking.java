package com.multi;

class C extends Thread {
	public void run() { // when thread is called then it is running state
		m1();
		for (int i = 65; i <= 70; i++) {
			System.out.println(Thread.currentThread().getName() + " " + (char) i);
		}
	}
	
	public void m1() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
}

public class ThreadWorking {

	public static void main(String[] args) {

		System.out.println("Main thread started");
		C t1 = new C(); // called as new state
		t1.start(); // called as runnable state
//		t1.start();      //Error: IllegalThreadStateException we can't call start function 
		                // morethan once on the same method

		for (int i = 0; i <= 3; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}

}
