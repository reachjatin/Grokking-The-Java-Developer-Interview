package com.multithreading.demo;

class Task implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() 
				+ " is running");
	}
}

public class ThreadTest {
	public static void main(String[] args) {

		for(int i=1; i<=5; i++) {
			Thread task = new Thread(new Task());
			task.setName("Thread " + i);
			task.start();
		}
		
	}
}