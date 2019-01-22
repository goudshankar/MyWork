package com.shs.multithreading;

public class TestCallRunMethod extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException ie) {System.out.println(ie);}
		System.out.println(i);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCallRunMethod t1=new TestCallRunMethod();
		
		t1.start();
		
	}

}
