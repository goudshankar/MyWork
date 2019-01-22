package com.shs.basics.programes;

import java.util.Scanner;

public class PrimeNumberCheckBW2Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter first Number::");
		int start=scn.nextInt();
		System.out.println("Enter second Number::");
		int end=scn.nextInt();
		System.out.println("List of prime Numbers between:"+start+" and "+end);
		for(int i=start;i<=end;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	public static boolean isPrime(int n) {
	/*	//mathematical solution
		if(n<=1) {
			return false;
		}	
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}*/
		//logical solution
		int i,m=0;
		 m=n/2;
		 if(n==0||n==1) {
			 return false;
		 }
		 for(i=2;i<=m;i++) {
			 if(n%i==0) {
				 return false;
			 }
		 }
		 
		 return true;
	}
}
