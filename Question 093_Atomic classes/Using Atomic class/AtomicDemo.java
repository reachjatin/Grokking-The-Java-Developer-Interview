package com.atomic.demo;

import java.util.concurrent.atomic.AtomicInteger;

class Task implements Runnable {
	private AtomicInteger count = new AtomicInteger();
	
	public int getCount() {
		return this.count.get();
	}
	
	@Override
	public void run() {	
		for(int i=1; i<=50; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			count.incrementAndGet();
		}
	}	
}

public class AtomicDemo {
	public static void main(String[] args) {
		Task task = new Task();
		
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Count is : " + task.getCount());	
	}
}
