package in.array;

public class DeadlockDemo {
	
	public void Method1() {
		synchronized(Integer.class) {
			System.out.println("I am the Integer class of Method1");
			try {
				Thread.sleep(100); // Introduce a delay
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized(String.class) {
				System.out.println("I am the String class of Method1");
			}
		}
	}
	
	public void Method2() {
		synchronized(Integer.class) {
			System.out.println("I am the String class of Method2");
			try {
				Thread.sleep(100); // Introduce a delay
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized(String.class) {
				System.out.println("I am the Integer class of Method2");
			}
		}
	}

	public static void main(String[] args) {
		DeadlockDemo demo = new DeadlockDemo();
		
		// Create two threads to demonstrate potential deadlock
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				demo.Method1();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				demo.Method2();
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
