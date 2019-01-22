package com.shs.multithreading;

public class MultiThreadsMultiTaskingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread(){
			public void run() {
				System.out.println("task one");
			}
		};
		
		Thread t2=new Thread() {
			public void run() {
				System.out.println("task two");
			}
		};
		t1.start();
		t2.start();
	}

}
