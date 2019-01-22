package com.shs.conversions;

public class IntToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=300;
		//String s=String.valueOf(i);
		String s=String.format("%d", i);
		String s1=Integer.toString(i);
		System.out.println(s1);
	}

}
