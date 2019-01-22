package com.shs.multithreading;

public class ShutdownHookByAnonymous extends Thread {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Runtime r=Runtime.getRuntime();
		r.addShutdownHook(new MyThread() {
			public void run() {
				System.out.println("shoutdownHook task completed");
			}
		});
		System.out.println("Main is sleeping press ctrl+c to exit");
		try {
			Thread.sleep(3000);
		}
		catch(Exception e) {System.out.println(e);}
	}

}
