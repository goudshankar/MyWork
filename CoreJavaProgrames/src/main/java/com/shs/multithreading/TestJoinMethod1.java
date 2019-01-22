package com.shs.multithreading;

public class TestJoinMethod1 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			//print i value
			System.out.println(i);
		}
	}//run()
	
	public static void main(String[] args) {
		TestJoinMethod1 testJoinMethod1=new TestJoinMethod1();
		TestJoinMethod1 testJoinMethod2=new TestJoinMethod1();
		TestJoinMethod1 testJoinMethod3=new TestJoinMethod1();
		testJoinMethod1.start();
		//add join() method to first thread
		try {
			testJoinMethod1.join();
		}
		catch(Exception e) {System.out.println(e);}
		testJoinMethod2.start();
		testJoinMethod3.start();
	}
}
