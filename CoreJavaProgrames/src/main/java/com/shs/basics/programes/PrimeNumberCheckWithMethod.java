package com.shs.basics.programes;

public class PrimeNumberCheckWithMethod {

	
	public static void primeCheck(int n) {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primeCheck(24);
	}

}
