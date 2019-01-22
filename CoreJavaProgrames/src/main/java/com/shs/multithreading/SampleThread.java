package com.shs.multithreading;

public class SampleThread extends Thread {
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		SampleThread t1=new SampleThread();
		t1.run();
		//System.out.println("Calling again...");
		//t1.start();
	}
}
