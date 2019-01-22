package com.shs.basics;

public class RecursiveCall {
	public static void forward(int  i) {
		
		if(i>0) {
		i=i-1;
		if(i%3==0)
		System.out.println(i);
		forward(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		forward(100);
	}

}
