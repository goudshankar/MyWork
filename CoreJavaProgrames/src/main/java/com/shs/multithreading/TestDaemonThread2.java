package com.shs.multithreading;

public class TestDaemonThread2 extends Thread {
	public void run() {
		System.out.println("Name is:"+Thread.currentThread().getName());
		System.out.println("Daemon:"+Thread.currentThread().isDaemon());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		TestDaemonThread2 testDaemonThread1=new TestDaemonThread2();
		TestDaemonThread2 testDaemonThread2=new TestDaemonThread2();
		//testDaemonThread1.setDaemon(true);
		testDaemonThread1.start();
		//testDaemonThread2.start();
		
	}

}
