package com.shs.multithreading;

public class InterruptingThread1 extends Thread {
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("task");
		}
		catch(InterruptedException e) {
			//throw new RuntimeException("Thread is Interrupted..");
		System.out.println("Exception is handled+"+e);
		}
		System.out.println("Thread is running..");
	}
	
}
