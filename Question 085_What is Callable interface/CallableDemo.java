package com.callable.demo;

import java.security.InvalidParameterException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Task implements Callable<Integer> {
	private int num;
	
	public Task(int num) {
		this.num = num;
	}
	
	@Override
	public Integer call() throws Exception {
		if(num < 0) {
			throw new InvalidParameterException("Negative number not allowed");
		}
		return num*num;
	}
}

public class CallableDemo {
	public static void main(String[] args) {
		
		Task task = new Task(5);
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		Future<Integer> f = es.submit(task);
				
		try {
			System.out.println("Result: " + f.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		es.shutdownNow();
	}
}