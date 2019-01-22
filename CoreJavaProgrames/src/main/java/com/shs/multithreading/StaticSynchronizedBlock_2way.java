package com.shs.multithreading;

public class StaticSynchronizedBlock_2way {
	public static void main(String[] args) {
	
		Thread t1=new MyThread() {
			public void run() {
				Table4.printTable(5);
			}
		};
		
		Thread t2=new MyThread(){
			public void run() {
				Table4.printTable(10);
			}
		};
		t1.start();
		t2.start();
	}
	
	
}
