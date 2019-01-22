package com.shs.multithreading;

public class ShutDownHookTest extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime r=Runtime.getRuntime();
		r.addShutdownHook(new MyThread());
		System.out.println("Main is sleeping prescc ctrl+c to exit:");
		try {
			Thread.sleep(3000);
		}
		catch(Exception e) {
			
		}
	}

}
