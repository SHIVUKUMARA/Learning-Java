package com.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TaskI implements Runnable{
	
	@Override
	public void run() {
	    System.out.println("Task1 started by "+Thread.currentThread().getName());
	    try {
	    	Thread.sleep(2000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    System.out.println("Task1 completed by "+Thread.currentThread().getName());
	}
}

class TaskII implements Runnable{
	
	@Override
	public void run() {
	    System.out.println("Task2 started by "+Thread.currentThread().getName());
	    try {
	    	Thread.sleep(2000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    System.out.println("Task2 completed by "+Thread.currentThread().getName());
	}
}

class TaskIII implements Runnable{
	
	@Override
	public void run() {
	    System.out.println("Task3 started by "+Thread.currentThread().getName());
	    try {
	    	Thread.sleep(2000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    System.out.println("Task3 completed by "+Thread.currentThread().getName());
	}
}

public class Task2 {

	public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.execute(new TaskI());
        service.execute(new TaskII());
        service.execute(new TaskIII());
        service.shutdown();
	}

}
