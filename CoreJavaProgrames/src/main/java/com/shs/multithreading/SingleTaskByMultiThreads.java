package com.shs.multithreading;

public class SingleTaskByMultiThreads extends Thread {
	public void run() {
		System.out.println("task one");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread(new SingleTaskByMultiThreads());
		Thread t2=new Thread(new SingleTaskByMultiThreads());
		t1.start();
		t2.start();
	}

}
