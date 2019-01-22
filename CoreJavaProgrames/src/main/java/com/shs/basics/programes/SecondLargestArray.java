package com.shs.basics.programes;

public class SecondLargestArray {
	public static int getLargest(int[] arr,int total) {
		int temp;
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}//if
			}//inner loop
		}//outer loop
		return arr[total-2];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,5,6,2,4,6,7};
		int[] arb= {3,5,2,7,8,9,5,1,4};
		System.out.println("Second Largest is:"+getLargest(arr,7));
		System.out.println("Second Largest is:"+getLargest(arb,9));
	}

}
