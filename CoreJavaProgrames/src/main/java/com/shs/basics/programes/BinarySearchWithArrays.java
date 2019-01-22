package com.shs.basics.programes;

import java.util.Arrays;

public class BinarySearchWithArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,60,70,50,25};
		int key=10;
		int result=Arrays.binarySearch(arr, key);
		if(result<0) {
			System.out.println("Element is not found");
		}
		else {
			System.out.println("Element is found:");
		}
	}

}
