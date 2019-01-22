package com.shs.arrays;

public class PassingAnArray2Method {
	//creating a method which receives an array as a parameter
	static void min(int array[]) {
		int min=array[0];
		for(int i=1;i<array.length;i++) {
			if(min>array[i])
				min=array[i];
			}
		System.out.println("The minimum value is:"+min);
	}
	static void max(int arr[]) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println("The max value is:"+max);
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {33,44,55};
		min(a);
		max(a);
	}

}
