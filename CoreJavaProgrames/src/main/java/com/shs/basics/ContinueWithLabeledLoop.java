package com.shs.basics;

public class ContinueWithLabeledLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//labeledLoop
		aa:
		for(int i=1;i<=3;i++) {
			bb:
				for(int j=1;j<=3;j++) {
					if(i==2&&j==2) {
						continue bb;	//skips aa labeled Loop and continue remaining
					}
					System.out.println(i+" "+j);
				}
		}
	}

}
