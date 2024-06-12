package com.example.multithreading;

public class Test1 implements Runnable {

	@Override
	public void run() {
		
		try {
			System.out.println("The name and state of thread inside run method is : " + Thread.currentThread().getName() + " " + Thread.currentThread().getState());
			for(int i=0; i<10; i++) {
				Thread.sleep(1000);
				System.out.println("Thread " + Thread.currentThread().getName() + " is running with value - " + i);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
