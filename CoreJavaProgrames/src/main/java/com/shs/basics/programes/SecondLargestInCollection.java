package com.shs.basics.programes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestInCollection {
	public static int getSecondLargest(Integer[] a,int total) {
		List<Integer> list=Arrays.asList(a);
		Collections.sort(list);
		int element=list.get(total-3);
		return element;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a= {1,2,5,6,3,2,7};
		System.out.println("Second Largest from Collections:"+getSecondLargest(a,7));
	}

}
