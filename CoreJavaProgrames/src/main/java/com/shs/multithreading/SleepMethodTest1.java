package com.shs.multithreading;

public class SleepMethodTest1 extends Thread {
	public void run() {
		for(int i=1;i<5;i++) {
			try {
			Thread.sleep(500);
			}
			catch(InterruptedException ie) {
				System.out.println(ie);
			}
			System.out.println(i);
		}
		
	}//run()
	public static void main(String[] args) {
		SleepMethodTest1 smt1=new SleepMethodTest1();
		SleepMethodTest1 smt2=new SleepMethodTest1();
		//System.out.println("going to sleep mode...");
		smt1.run();
				
	}
}
