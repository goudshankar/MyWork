package com.shs.multithreading;

public class MyThread3 extends Thread {
	Table1 t;
	public MyThread3(Table1 t) {
		// TODO Auto-generated constructor stub
		this.t=t;
	}
	public void run() {
		t.printTable(5);
	}
}
