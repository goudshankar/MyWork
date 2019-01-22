package com.shs.basics.programes;

public class MatrixAdditionExample1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create two matrices
		int a[][]= {{1,3,4},{2,4,3},{3,4,5}};
		int b[][]= {{1,3,4},{2,4,3},{1,2,4}};
		//create another matrix that holds the result
		int c[][]=new int[3][3];
		//add two matrix and print
		/*for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();	
		}*/
		/*//multiply two matrices
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]*b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}*/
		//subtraction of two matrices
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]-b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
