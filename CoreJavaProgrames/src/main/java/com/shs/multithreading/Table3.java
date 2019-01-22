package com.shs.multithreading;

public class Table3 {
	static synchronized void printTable(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(400);
			}
			catch(Exception e) {System.out.println(e);}
		}//for
	}//sync
}
