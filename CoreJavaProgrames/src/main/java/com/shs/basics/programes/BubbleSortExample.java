package com.shs.basics.programes;
/*	Bubble Sort:In bubble sort array is traversed from 1st element to last element.
 * Here current element is compared with with the next element.
 * if the current element is greater than next element then swap it.
 * 
 * */
public class BubbleSortExample {
	static void bubbleSort(int[] arr) {
		int n=arr.length;//n=7
		int temp=0;
		for(int i=0;i<n;i++) {	//i=0,0<7
			for(int j=1;j<(n-i);j++) {	//1<7 true
				//current ele is greater than next element then swap it
				if(arr[j-1]>arr[j]) {
					//swap elements
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}//inner for loop
		}//outer for loop
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long before=System.currentTimeMillis();
		int arr[]= {3,60,35,2,45,320,5,3,60,35,2,45,320,5,3,60,35,2,45,320,5,3,60,35,2,45,320,5,3,60,35,2,45,320,5};
		
		System.out.println("Array Before bubble Sort");
		
		for(int i=1;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//call the bubblesort method
		bubbleSort(arr);
		System.out.println("Array After bubble Sort");
		/*for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}*/
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		Long after=System.currentTimeMillis()-before;
		System.out.println("After:"+after);
	}

}
