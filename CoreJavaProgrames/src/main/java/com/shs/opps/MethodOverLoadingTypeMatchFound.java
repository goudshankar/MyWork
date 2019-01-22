package com.shs.opps;

public class MethodOverLoadingTypeMatchFound {
	void sum(int a,int b) {System.out.println("The sum of two numbers:"+(a+b));}
	void sum(long a,long b) {
		System.out.println("The sum of two Numbers:"+(a+b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLoadingTypeMatchFound molt=new MethodOverLoadingTypeMatchFound();
		molt.sum(20L, 20L);
		

	}

}
