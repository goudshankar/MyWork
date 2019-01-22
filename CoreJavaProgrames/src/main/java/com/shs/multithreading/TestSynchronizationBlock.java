package com.shs.multithreading;

public class TestSynchronizationBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table1 obj=new Table1();
		Thread t1=new MyThread3(obj);
		Thread t2=new MyThread4(obj);
		t1.start();
		t2.start();
	}

}
