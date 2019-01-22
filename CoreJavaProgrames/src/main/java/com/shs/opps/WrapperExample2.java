package com.shs.opps;

public class WrapperExample2 {
	private void mai() {
		// TODO Auto-generated method stub
		Integer a=new Integer(20);
		int i=a.intValue();
		int j=a;//unboxing,compiler converts the Integer object to primitive type
		System.out.println(a+" "+i+" "+j);
	}
	
}
