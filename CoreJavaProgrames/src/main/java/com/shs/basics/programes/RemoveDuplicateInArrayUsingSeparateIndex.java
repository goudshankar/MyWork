package com.shs.basics.programes;

public class RemoveDuplicateInArrayUsingSeparateIndex {
	public static int removeDuplicate(int[] arr,int n) {
		if(n==0||n==1) {
			return n;
		}
		int j=0;
		for(int i=0;i<j;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j++]=arr[i];
			}
		}
		arr[j++]=arr[n-1];
		return j;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,30,50,48,50,30,20};
		int length=a.length;
		length=removeDuplicate(a, length);
		for(int i=0;i<length;i++) {
			System.out.println(a[i]+":is Removed ");
		}
	}

}
