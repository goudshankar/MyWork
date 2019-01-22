package com.shs.arrays;

public class PassingAnAnonymousArray2Method {
	//creating a method that receives an array as param
	static void printArray(int arr[]) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i])
				min=arr[i];
		}
		System.out.println("The minimum is:"+min);
		
	}
	static void printMaxArray(int arr[]) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println("The maximum value is:"+max);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printArray(new int[] {22,33,44});
		printMaxArray(new int[] {22,33,44,55,66});
	}

}
