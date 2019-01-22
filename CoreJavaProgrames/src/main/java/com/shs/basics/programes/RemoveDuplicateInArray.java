package com.shs.basics.programes;

public class RemoveDuplicateInArray {
	public static int removeDuplicate(int[] a,int n) {
		if(n==0||n==1) {
			return n;
		}
		int[] temp=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(a[i]!=a[i+1]) {
				temp[j+1]=a[i];
			}
		}
		temp[j++]=a[n-1];
		//Now chang original array
		for(int i=0;i<j;i++) {
			a[i]=temp[i];
		}
		return j;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,30,40,50,60,30,50};
		int length=a.length;
		//length=removeDuplicate(a,length);
		for(int i=0;i<length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
