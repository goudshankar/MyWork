package com.shs.multithreading;

public class TestInterruptingThread4 extends Thread {
	
	public void run() {
		for(int i=1;i<=2;i++) {
			if(Thread.interrupted()) {
				System.out.println("code for interupted thread");
			}
			else {
				System.out.println("Code for normal Thread");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterruptingThread4 t1=new TestInterruptingThread4();
		TestInterruptingThread4 t2=new TestInterruptingThread4();
		t1.start();
		t1.interrupt();
		t2.start();
	}

}
