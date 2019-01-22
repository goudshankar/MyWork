package com.shs.basics.programes;

public class SelectionSortExample {
	public static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int index=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[index]) {
					index=j;	//searching for lowest index
				}
			}//inner for loop
			int smallerNumber=arr[index];
			arr[index]=arr[i];
			arr[i]=smallerNumber;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long before=System.currentTimeMillis();
		int[] arr1= {3,60,35,2,45,320,5,3,60,35,2,45,320,5,3,60,35,2,45,320,5,3,60,35,2,45,320,5,3,60,35,2,45,320,5};
		System.out.println("Before selection sort");
		for(int i:arr1) {
			System.out.print(i+" ");
		}
		System.out.println();
		selectionSort(arr1);
		System.out.println("After Selection Sort:");
		for(int i:arr1) {
			System.out.print(i+" ");
		}
		System.out.println();
		Long after=System.currentTimeMillis()-before;
		System.out.println("Time In Milli Seconds:"+after);
	}

}
