package com.shs.multithreading;

public class MultitaskingTest1 extends Thread {
	public void run() {
		System.out.println("task one");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultitaskingTest1 t1=new MultitaskingTest1();
		MultitaskingTest1 t2=new MultitaskingTest1();
		MultitaskingTest1 t3=new MultitaskingTest1();
		t1.start();
		t2.start();
		t3.start();
	}

}
