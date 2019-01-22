package com.shs.multithreading;

public class MyThread4 extends Thread {
	Table1 t;
	public MyThread4(Table1 t) {
		// TODO Auto-generated constructor stub
		this.t=t;
	}
	public void run() {
		t.printTable(100);
	}
}
