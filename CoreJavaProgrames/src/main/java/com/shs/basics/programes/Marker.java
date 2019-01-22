package com.shs.basics.programes;

public class Marker implements Cloneable {

	
	public static void main(String args[]) throws Exception {
		Marker m=new Marker();
		if(m instanceof Cloneable) {
			System.out.println("Hello");
		}else {
			throw new Exception();
		}
	}
}
