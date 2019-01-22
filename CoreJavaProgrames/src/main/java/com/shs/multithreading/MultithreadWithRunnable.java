package com.shs.multithreading;

public class MultithreadWithRunnable{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultithreadWithRunnable multithreadWithRunnable=new MultithreadWithRunnable();
		multithreadWithRunnable.runThread();
	}

	void runThread() {

		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread1");
			}
		});
		thread.start();
		Thread thread1 =new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread2");
				
			}
		});
		
		thread1.run();
	}

}
