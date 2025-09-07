package com.multi;

class Table{
	public static synchronized void printTable(int num) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " entered into method");
		for(int i = 1; i <= 10; i++) {
			System.out.println(num+ " X "+i+ " = "+ (num*i)+ "-----> "+ Thread.currentThread().getName());
			Thread.sleep(1000);
		}
	}
}

class T3 extends Thread{
	private Table table;
	T3(Table table){
		this.table = table;
	}
	public void run() {
		try {
			this.table.printTable(2);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}

class T4 extends Thread{
	private Table table;
	T4(Table table){
		this.table = table;
	}
	public void run() {
		try {
			this.table.printTable(5);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}

class T5 extends Thread{
	private Table table;
	T5(Table table){
		this.table = table;
	}
	public void run() {
		try {
			this.table.printTable(10);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}


public class Test5 {

	public static void main(String[] args) throws InterruptedException {
		Table table3 = new Table();
		Table table4 = new Table();
		Table table5 = new Table();
		T3 t3 = new T3(table3);
		T4 t4 = new T4(table4);
		T5 t5 = new T5(table5);
		
		t3.start();
//		t3.join(); //to maintain order of execution
		t4.start();
		t5.start();
	}

}
