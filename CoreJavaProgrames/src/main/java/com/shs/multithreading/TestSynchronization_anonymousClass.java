package com.shs.multithreading;

public class TestSynchronization_anonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Table obj=new Table();
		Thread t1=new MyThread() {
			public void run() {
				obj.printTable(5);
			}
		};
		Thread t2=new Thread() {
			public void run() {
				obj.printTable(100);
			}
		};
		t1.start();
		t2.start();
	}

}
