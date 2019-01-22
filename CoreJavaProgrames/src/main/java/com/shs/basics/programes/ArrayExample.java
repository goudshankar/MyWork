package com.shs.basics.programes;

public class ArrayExample {
	public static void bubbleSort(int[] arr) {
		int n=arr.length;
		int temp=0;
		for(int i=0;i<n;i++) {
			for(int j=1;j<(n-i);j++) {
				//if current element is greater than next element then swap it
				if(arr[j-1]>arr[j]) {
					temp=arr[j-1];	//current element [j-1]
					arr[j-1]=arr[j];//here arr[j] is next element
					arr[j]=temp;	//next element is swapped
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,4,5,2};
		int n=arr.length;
		System.out.println("Before sorting Array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		bubbleSort(arr);
		System.out.println("Array After sorting:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
