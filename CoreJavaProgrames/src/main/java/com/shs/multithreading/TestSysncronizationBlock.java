package com.shs.multithreading;

public class TestSysncronizationBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table2 t=new Table2();
		Thread t1=new MyThread() {
			public void run() {
				t.printTable(5);
			}
		};
		Thread t2=new MyThread() {
			public void run() {
				t.printTable(100);
			}
		};
		
		t1.start();
		t2.start();
	}

}
