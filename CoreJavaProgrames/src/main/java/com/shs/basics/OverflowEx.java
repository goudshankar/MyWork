package com.shs.basics;

public class OverflowEx {
	public static void main(String[] args) {
		int a=129;
		byte b=(byte)a;	//narraowing assigning bigger data type variable to small data type value
		System.out.println(a);
		System.out.println(b);
	}
}
