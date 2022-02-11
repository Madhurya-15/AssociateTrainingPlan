package com.example.multithreading;

public class Multithreading {
	
	public static void main(String[] args) {
		
		Test1 obj1 = new Test1();
		Thread t1 = new Thread(obj1);
		Thread t2 = new Test2();
		System.out.println("Thread name outside is ...." + Thread.currentThread().getName());
		
		System.out.println("States of threads just after creation.......................");
		System.out.println("The state of thread t1 is : " + t1.getState());
		System.out.println("The state of thread t2 is : " + t2.getState());
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Name of thread is " + Thread.currentThread().getName() + " and state of the thread is " + Thread.currentThread().getState());
		System.out.println("The state of thread t1 is : " + t1.getState());
		System.out.println("The state of thread t2 is : " + t2.getState());
		
	}
 }
 