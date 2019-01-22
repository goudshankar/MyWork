package com.shs.multithreading;

public class ThreadPriority extends Thread {
	public void run() {
	System.out.println("runing thread name is:"+Thread.currentThread().getName());
	System.out.println("runing thread priority is:"+Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPriority threadPriority1=new ThreadPriority();
		ThreadPriority threadPriority2=new ThreadPriority();
		//set thread priority
		//threadPriority1.setPriority(MIN_PRIORITY);
		//threadPriority1.setPriority(NORM_PRIORITY);
		threadPriority1.setPriority(MAX_PRIORITY);
		
		threadPriority1.start();
		//threadPriority2.start();
	}

}
