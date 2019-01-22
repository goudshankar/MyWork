package com.shs.basics.programes;

import java.util.Scanner;

public class MatrixTrasposeWithScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		System.out.println("Enter total rows and colmns");
		Scanner scn=new Scanner(System.in);
		int row=scn.nextInt();
		int column=scn.nextInt();
		int arr[][]=new int[row][column];
		System.out.println("Enter Matrix");
		for(i=0;i<row;i++) {
			for(j=0;j<column;j++) {
				arr[i][j]=scn.nextInt();
				System.out.println(" ");
			}//inner loop
		}//outer loop
		
		System.out.println("Before transpose:");
		for(i=0;i<row;i++) {
			for(j=0;j<column;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();//new line
		}
		System.out.println("After transpose:");
		for(i=0;i<row;i++) {
			for(j=0;j<column;j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
	}

}
}