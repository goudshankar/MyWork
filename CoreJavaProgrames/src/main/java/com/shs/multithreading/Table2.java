package com.shs.multithreading;

public class Table2 {
	public void printTable(int n) {
		synchronized(this) {
			for(int i=1;i<=5;i++) {
				System.out.println(n*i);
				try {
					Thread.sleep(400);
				}
				catch(Exception e) {System.out.println(e);}
			}//for
		}//syncblock
	}//printTable(-)
}//class
