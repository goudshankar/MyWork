package com.shs.multithreading;

public class ThreadGroupDemo implements Runnable {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		ThreadGroupDemo runnable =new ThreadGroupDemo();
		ThreadGroup tg1=new ThreadGroup("parent Thread");
		
		Thread t1=new Thread(tg1,runnable,"one");
		t1.start();  
		Thread t2=new Thread(tg1,runnable,"two");
		t2.start();
		Thread t3=new Thread(tg1,runnable,"three");
		t3.start();
		System.out.println("ThreadGroup name is:"+tg1.getName());
		tg1.list();
	}
}
