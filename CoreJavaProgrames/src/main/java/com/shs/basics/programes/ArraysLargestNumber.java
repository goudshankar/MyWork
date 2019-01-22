package com.shs.basics.programes;

public class ArraysLargestNumber {

	public static int getLargest(int[] a,int total) {
		int temp;
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[total-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,5,6,3,2};
		int[] b= {44,99,77,66,33,22,55};
		System.out.println("Largest:"+getLargest(a,6));
		System.out.println("Largest:"+getLargest(b,7));
		
	}

}
