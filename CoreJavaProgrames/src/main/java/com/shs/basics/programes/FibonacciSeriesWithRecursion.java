package com.shs.basics.programes;



public class FibonacciSeriesWithRecursion {

	static int n1=0,n2=1,n3=0,c=1;
	
	static void printFibonacci(int count) {
		if(count<=10) {
			System.out.println(count);
			//n3=n1+n2;
			//n1=n2;
			//n2=n3;
			//print n3
		//	System.out.print(" "+n3);
			count++;
			printFibonacci(count);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1;
		//print 0 and 1
		//System.out.print(n1+" "+n2);
		printFibonacci(count);//
	}

}
