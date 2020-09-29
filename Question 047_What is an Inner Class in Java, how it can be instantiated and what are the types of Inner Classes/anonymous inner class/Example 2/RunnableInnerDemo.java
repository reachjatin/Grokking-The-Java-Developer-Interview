package com.demo.inner;

public class RunnableInnerDemo {

	public static void main(String[] args) {

		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread 1");
			}
		});
		
		t.start();
		
		System.out.println("Main Thread");
	}
}
