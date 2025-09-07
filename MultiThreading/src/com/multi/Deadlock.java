package com.multi;

class SharedResource{
	static final String r1 = "Pen";
	static final String r2 = "Papaer";
}

class TA extends Thread{
	public void run() {
		synchronized(SharedResource.r1) {
			System.out.println("TA acquired lock of PEN.waiting for PAPER");
			synchronized(SharedResource.r2) {
				System.out.println("Acquired the lock of PAPER");
				System.out.println("Writing Completed");
			}
		}
	}
}

class TB extends Thread{
	public void run() {
		synchronized(SharedResource.r1) {
			System.out.println("TB acquired lock of PAPER.waiting for PEN");
			synchronized(SharedResource.r2) {
				System.out.println("Acquired the lock of PEN");
				System.out.println("Writing Completed");
			}
		}
	}
}

public class Deadlock {

	public static void main(String[] args) {
		TA t1 = new TA();
		TB t2 = new TB();
		
		t1.start();
		t2.start();
	}

}
