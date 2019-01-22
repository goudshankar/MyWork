package com.shs.basics;

public class ContinueStmtWithInnerLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=3;i++) {
			//inner loop
			for(int j=1;j<=3;j++) {
				if(i==2&&j==2) {
					continue;	//it'll skip the matched condition and execute remaining things
				}
				System.out.println(i+" "+j);
			}
		}
	}

}
