package com.shs.basics.programes;

import java.util.Arrays;

public class SecondLargestUsingArrays {
	
	public static int getLargest(int[] a,int total) {
		Arrays.sort(a);
		return a[total-2];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {34,56,78,98,23,12};
		System.out.println("Second Largest is:"+getLargest(a,6));
	}

}
