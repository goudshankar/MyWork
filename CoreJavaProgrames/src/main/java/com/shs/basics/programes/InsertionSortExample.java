package com.shs.basics.programes;

public class InsertionSortExample {
	
	public static void insertionSort(int array[]) {
		int n=array.length;//get the length of an array
		for(int j=1;j<n;j++) {
			int key=array[j];	//array[1]=14
			int i=j-1;			//i=1-1=>i=0
			while((i>-1)&&(array[i]>key)){	//(0>-1)&&(9>14)
				array[i]=array[j];
				i--;
			}
			array[i+1]=key;		//array[2]=14 is updated
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {9,14,3,2,43,11,58,22};
		System.out.println("Before Insertion Sort:");
		for(int i:arr1) {
			System.out.print(i+" ");
		}
		System.out.println();
		insertionSort(arr1);
		System.out.println("After Insertion Sort");
		for(int i:arr1) {
			System.out.print(i+" ");
		}
	}

}
