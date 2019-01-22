package com.shs.basics.programes;

public class ThirdLargestArray {
	public static int getLargest(int[] a,int total) {
		int temp;
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}//if
			}//inner loop
		}//outer loop
		return a[total-3];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3,4,2,6,9,23,34,65};
		System.out.println("The Third Largest is:"+getLargest(a,8));
	}

}
