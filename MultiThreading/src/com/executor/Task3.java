package com.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class TaskIV implements Callable<String>{
	@Override
	public String call() throws Exception{
		System.out.println("Task Started...");
		Thread.sleep(1000);
		return "Task Completed";
	}
}

public class Task3 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> result = executor.submit(new TaskIV());
        Thread.sleep(2000);
        if(result.isDone()) {
        	System.out.println(result.get());
        }
        executor.shutdown();
	}
}