package com.shs.basics.programes;

public class MatrixTransposeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int original[][]= {{1,3,4},{2,4,3},{3,4,5}};
		//create another matrix to store result
		int transpose[][]=new int[3][3];
		//code to transpose
		for(int i=0;i<3;i++) {
			for(int j=0;i<3;i++) {
				transpose[i][j]=original[j][i];
			}
		}
		//print without  transpose
		System.out.println("print withour transpose:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(original[i][j]+" ");
			}
			System.out.println();
		}
		//print with transpose
		System.out.println("print with transpose:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
