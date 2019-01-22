package com.shs.opps;

public class MethodOverloadingTest1 {
	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingTest1 molt=new MethodOverloadingTest1();
		System.out.println(molt.add(10, 30));
		System.out.println(molt.add(10, 40, 70));
	}

}
