package com.multi;

class X extends Thread{
	public void run() {
		for(int i = 0; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName()+ " " + i);
		}
	}
}

class Y extends Thread{
	public void run() {
		for(int i = 97; i <= 102; i++) {
			System.out.println(Thread.currentThread().getName()+ " " + (char)i);
		}
	}
}

public class Test4 {

	public static void main(String[] args) {

		X x = new X();
		Y y = new Y();
		//changing thread name by using setName() function
		x.setName("Thread-X");
		y.setName("Thread-Y");
		
		//setting priority
		y.setPriority(Thread.MAX_PRIORITY);
		x.start();
		y.start();
		
	}

}
