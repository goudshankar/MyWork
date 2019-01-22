package com.shs.multithreading;

public class Multithread extends Thread {
	public void run() {
		System.out.println("Thread is runing...");
	}
	public static void main(String[] args) {
		Multithread mthread=new Multithread();
		mthread.start();
	}
}
