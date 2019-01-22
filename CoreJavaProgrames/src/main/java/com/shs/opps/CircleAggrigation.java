package com.shs.opps;

public class CircleAggrigation {
	private Operation op;
	double pi=3.141;
	double area(int radius) {
		op=new Operation();
		int rsquare=op.square(radius);
		return pi*rsquare;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleAggrigation cg=new CircleAggrigation();
		double result=cg.area(5);
		System.out.println("The Area of Cirle is:"+result);
	}

}
