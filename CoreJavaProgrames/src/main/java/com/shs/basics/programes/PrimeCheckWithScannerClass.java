package com.shs.basics.programes;

import java.util.Scanner;

public class PrimeCheckWithScannerClass {
	
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Please Enter a Number");
		int n=scn.nextInt();
		if(isPrime(n)) {
			System.out.println(n+"::is a Prime Number");
		}
			else{
				System.out.println(n+"::is Not a prime Number");
			}
		}
	}

