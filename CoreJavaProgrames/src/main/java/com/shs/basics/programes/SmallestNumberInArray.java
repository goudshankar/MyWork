package com.shs.basics.programes;

public class SmallestNumberInArray {
	public static int getSmallest(int[] a,int total) {
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
		return a[0];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3,5,4,7,9,12,24};
		System.out.println("The smallest Number is:"+getSmallest(a,7));
	}

}
