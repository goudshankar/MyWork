package com.shs.multithreading;

public class TestJoinMethod2 extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			//print i values
			System.out.println(i);
		}//run()
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestJoinMethod2 testJoinMethod1=new TestJoinMethod2();
		TestJoinMethod2 testJoinMethod2=new TestJoinMethod2();
		TestJoinMethod2 testJoinMethod3=new TestJoinMethod2();
		testJoinMethod1.start();
		//add the join method to t1 thread ,so that after completion of t1 thread it'll join() other threads to complete execution
		try {
			testJoinMethod1.join(1500);
		}
		catch(Exception e) {System.out.println(e);}
		testJoinMethod2.start();
		testJoinMethod3.start();
	}

}
