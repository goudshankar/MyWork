package com.shs.multithreading;
/* create 10000 instances,after creating the 10k instances free memory will be less than
 * previous free memory.but after gc() method call you'll get more free memory.
 * */
public class Runtime_freeMemoryMethod_totalMemoryMethd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime r=Runtime.getRuntime();
		System.out.println("Total memory:"+r.totalMemory());
		System.out.println("Total free memory:"+r.freeMemory());
		for(int i=0;i<10000;i++) {
			new Runtime_availableProcessorsMethod();
		}
		System.out.println("After creating 10000 instance,free memory:"+r.freeMemory());
		System.gc();
		System.out.println("after calling gc() method free memory is:"+r.freeMemory());
	}

}
