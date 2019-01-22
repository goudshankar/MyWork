package com.shs.basics.programes;

public class FibonacciSeriesWithRecursion1 {
	static int n1=0,n2=1,n3=0;
	
	static void printFibonacci(int count) {
		if(count<=10) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			//method calls it self from inside the method only(Recusivly)
			count++;
			printFibonacci(count);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int count=1;
	//print 0 and 1
	System.out.print(n1+" "+n2);
	printFibonacci(count-2);
	}

}
