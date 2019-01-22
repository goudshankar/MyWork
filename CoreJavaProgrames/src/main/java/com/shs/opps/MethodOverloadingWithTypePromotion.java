package com.shs.opps;

public class MethodOverloadingWithTypePromotion {
	void sum(int a,long b) {System.out.println("Sum of two numbers:"+(a+b));}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingWithTypePromotion mlt=new MethodOverloadingWithTypePromotion();
		mlt.sum(20,20);
	}

}
