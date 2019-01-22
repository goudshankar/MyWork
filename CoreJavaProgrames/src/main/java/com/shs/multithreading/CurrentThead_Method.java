package com.shs.multithreading;

public class CurrentThead_Method extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrentThead_Method currentThead_Method=new CurrentThead_Method();
		currentThead_Method.start();
	}
}
