package com.shs.multithreading;

public class TestSynchronization1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table t=new Table();
		Thread t1=new MyThread1(t);
		Thread t2=new MyThread2(t);
		t1.start();
		
		t2.start();
	}

}
