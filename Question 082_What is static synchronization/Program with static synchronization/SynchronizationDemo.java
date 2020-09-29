package com.multithreading.demo;

class Hello {
	
	static synchronized void sayHello() {
		System.out.println("in sayHello() method " +
									Thread.currentThread().getName());
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName() + " , i = " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Task implements Runnable {

	Hello h;
	
	Task(Hello h) {
		this.h = h;
	}	
	
	@Override
	public void run() {
		h.sayHello();
	}
	
}

public class SynchronizationDemo {
	public static void main(String[] args) {
		Hello obj1 = new Hello();
		Hello obj2 = new Hello();
		
		Thread task1 = new Thread(new Task(obj1));
		task1.setName("First Thread");
		Thread task2 = new Thread(new Task(obj1));
		task2.setName("Second Thread");
		Thread task3 = new Thread(new Task(obj2));
		task3.setName("Third Thread");
		Thread task4 = new Thread(new Task(obj2));
		task4.setName("Fourth Thread");
		
		task1.start();
		task2.start();
		task3.start();
		task4.start();
	}
}
