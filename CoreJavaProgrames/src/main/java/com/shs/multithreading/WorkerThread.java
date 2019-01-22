package com.shs.multithreading;

import java.util.Spliterator;

public class WorkerThread implements Runnable {
	private String msg;
	public WorkerThread(String s) {
		// TODO Auto-generated constructor stub
		this.msg=s;
	}
	//run method
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+"(Start)message"+msg);
		//call process msg that sleeps the thread for 2 seconds
		processMsg();
		System.out.println(Thread.currentThread().getName()+"(End)");
	}
	private void processMsg() {
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException ie) {System.out.println(ie);}
	}
	

}
