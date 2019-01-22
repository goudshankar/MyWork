package com.shs.multithreading;

public class TestSynchronizationAnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1=new MyThread5() {
			public void run() {
				Table3.printTable(1);
			}
		};
		Thread t2=new MyThread6() {
			public void run() {
				Table3.printTable(10);
			}
		};
		Thread t3=new MyThread7() {
			public void run() {
				Table3.printTable(100);
			}
		};
		Thread t4=new MyThread8() {
			public void run() {
				Table3.printTable(1000);
			}
		};
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
