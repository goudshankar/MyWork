package com.shs.strings;

public class B extends A {
 int i=0;
	B m1() {
		return this;
	}

	void m2() {
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a =  new B();
		//System.out.println(a.m2);
		//System.out.println(a.m2());
		a.m1().m2();
		System.out.println(((B)a.m1()).i);
		
	}
}
