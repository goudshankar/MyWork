package com.shs.multithreading;

public class Table4 {
	static void printTable(int n) {
		synchronized(Table4.class) {
			for(int i=1;i<=10;i++) {
				System.out.println(n*i);
				try {
					Thread.sleep(400);
				}
				catch(Exception e) {}
			}
		}
	}
}
