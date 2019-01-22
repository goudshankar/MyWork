package com.shs.multithreading;

public class TestInterruptingThread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterruptingThread1 it=new InterruptingThread1();
		it.start();
		/*try {
			it.interrupt();
		}
		catch(Exception e) {
			System.out.println("Exception handled"+e);
		}*/
		it.interrupt();
	}

}
