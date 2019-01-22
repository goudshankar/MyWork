package com.shs.arrays;

public class ReturnAnArrayFromMethod {
	
	//creating a method that returns an array
	static int[] returnArray() {
		return new int[] {10,20,30,50};
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=returnArray();
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

}
