package com.shs.multithreading;
/* we can change the name of the threads ,by default thread name like Thread-0,Thread-1
 * */
public class NamingThreadTest extends Thread{
	public void run() {
		System.out.println("running thread....");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NamingThreadTest namingThreadTest1=new NamingThreadTest();
		System.out.println("Bydefault Name is:"+namingThreadTest1.getName());
		//change the name of the thread
		namingThreadTest1.setName("customThreadName");
		System.out.println("After changing the thread name is:"+namingThreadTest1.getName());
	}

}
