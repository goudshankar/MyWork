package com.shs.basics.programes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestNumberUsingCollections {
	public static int getSmallest(Integer[] a,int total) {
		List<Integer>list=Arrays.asList(a);
		Collections.sort(list);
		int element=list.get(12-4);
		return element;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a= {6,8,9,7,5,10,30,56,78,98,73,24,65};
		System.out.println("The Smallest Number From collection is:"+getSmallest(a,13));
	}

}
