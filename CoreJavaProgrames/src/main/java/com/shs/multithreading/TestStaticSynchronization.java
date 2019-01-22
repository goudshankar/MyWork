package com.shs.multithreading;

public class TestStaticSynchronization {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread5 t1=new MyThread5();
		MyThread6 t2=new MyThread6();
		MyThread7 t3=new MyThread7();
		MyThread8 t4=new MyThread8();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
