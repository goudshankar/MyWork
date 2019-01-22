package com.shs.multithreading;

public class TestJoinMethod3 extends Thread{
	public void run() {
		System.out.println("Thread running....");
	}
	public static void main(String[] args) {
		//create 2 threads
		TestJoinMethod3 testJoinMethod1=new TestJoinMethod3();
		TestJoinMethod3 testJoinMethod2=new TestJoinMethod3();
		//get thead names by using getName() method
		System.out.println("First Thread Name is:"+testJoinMethod1.getName());
		System.out.println("Second Thread name is:"+testJoinMethod2.getName());
		//get thread Id by using getId() method
				System.out.println("First Thread Id is:"+testJoinMethod1.getId());
				System.out.println("Second Thread Id is:"+testJoinMethod2.getId());
		//set thread name by using setName() method
		testJoinMethod1.setName("shankarThread");
		System.out.println("After modifying the first thread is:"+testJoinMethod1.getName());
		
	}

}
