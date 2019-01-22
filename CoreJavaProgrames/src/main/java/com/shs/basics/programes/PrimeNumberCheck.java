package com.shs.basics.programes;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=scn.nextInt();
		int i,m=0,flag=0;
		m=n/2;
		if(n==0||n==1) {
			System.out.println(n+"::is Not a prime Number");
		}
		else {
			for(i=2;i<=m;i++) {
				if(n%i==0) {
					System.out.println(n+"::is Not a prime Number");
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(n+"::is a prime Number");
			}
		}
	}

}
