package com.multithreading.demo;

class Demo {
	public static synchronized void m1() {
		System.out.println("inside m1()");
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName() + " , i = " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static synchronized void m2() {
		System.out.println("inside m2()");
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

public class Test {
	public static void main(String[] args) {
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				d1.m1();
			}
		});
		t1.setName("First thread");
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				d2.m2();
			}
		});
		t2.setName("Second thread");
		
		t1.start();
		t2.start();
	}
}