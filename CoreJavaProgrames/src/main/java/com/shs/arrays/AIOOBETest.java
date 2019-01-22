package com.shs.arrays;
/*
 * ArrayIndexOutOfBoundException occures when an array size is negative,equal and greater than the size then we 
 * will get AIOOBE.
 * */
public class AIOOBETest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {50,60,70};
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

}
