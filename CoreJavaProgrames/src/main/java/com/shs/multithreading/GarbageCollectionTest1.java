package com.shs.multithreading;

public class GarbageCollectionTest1 {
	public void finalize() {
		System.out.println("Object is garbage collected..");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageCollectionTest1 gb1=new GarbageCollectionTest1();
		GarbageCollectionTest1 gb2=new GarbageCollectionTest1();
		gb1=null;
		//gb2=null;
		System.gc();
	}

}
