package com.shs.multithreading;

public class InterruptingThread_NormalBehaviour extends Thread {
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		InterruptingThread_NormalBehaviour itn=new InterruptingThread_NormalBehaviour();
		itn.start();
		itn.interrupt();
	}
}
