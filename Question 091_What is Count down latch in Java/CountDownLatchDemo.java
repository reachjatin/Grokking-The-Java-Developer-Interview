package com.countdownlatch.demo;

import java.util.concurrent.CountDownLatch;

class Task implements Runnable {

	String service;
	CountDownLatch latch;
	
	public Task(String service, CountDownLatch latch) {
		this.service = service;
		this.latch = latch;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(service + " is up");
		latch.countDown();
	}
	
}

public class CountDownLatchDemo {

	public static void main(String[] args) {
		
		CountDownLatch latch = new CountDownLatch(3);
		
		Thread t1 = new Thread(new Task("Service1", latch));
		Thread t2 = new Thread(new Task("Service2", latch));
		Thread t3 = new Thread(new Task("Service3", latch));
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			latch.await();
			System.out.println("All services are up, Starting Main Application now");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}