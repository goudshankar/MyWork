package com.shs.arrays;
/* program to declare,instatiate,initialize and traverse an array
 * */
public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];	//declaring and instatiating an array
		a[0]=10;	//initializing an array
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		//traversing an array 
	/*	for(int i=0;i<a.length;i++)
			System.out.println(a[i]);*/
		//traversing an array in reverse order
		for(int i=a.length-1;i>=0;i--)
			System.out.println(a[i]);
		
	}

}
