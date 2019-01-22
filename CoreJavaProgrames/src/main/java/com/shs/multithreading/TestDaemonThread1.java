package com.shs.multithreading;

public class TestDaemonThread1  extends Thread{
	public void run() {
		//check if the daemon thread is running or not
		if(Thread.currentThread().isDaemon()) {
			System.out.println("The Daemon thread is running....");
		}
		else {
			System.out.println("The user Thread is running....");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDaemonThread1 testDaemonThread1=new TestDaemonThread1();
		TestDaemonThread1 testDaemonThread2=new TestDaemonThread1();
		TestDaemonThread1 testDaemonThread3=new TestDaemonThread1();
		//set current thread as daemon thread
		testDaemonThread1.setDaemon(true);
		testDaemonThread1.start();
		testDaemonThread2.start();
		testDaemonThread3.start();
		
	}

}
