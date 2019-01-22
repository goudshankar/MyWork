package com.shs.basics.programes;

import java.util.Arrays;

public class SmallestNumberUsingArraysMethod {
	public static int getSmallest(int[] a,int total) {
		Arrays.sort(a);
		return a[0];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3,4,8,7,9};
		System.out.println("The Smallest Number is:"+getSmallest(a,5));
	}

}
