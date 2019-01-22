package com.shs.basics;

public class VariablesExample {

	int data=50;	//instance variable
	static int m=100;	//static variable
	int m1() {
		int n=90;
		return n;//local variable
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(data);
		VariablesExample ve=new VariablesExample();
		System.out.println(m);
	}

}
