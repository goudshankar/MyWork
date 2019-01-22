package com.shs.basics.programes;

public class ArmstrongNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0,a,temp;
		int n=40;
		temp=n;
		while(n>0) {
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		if(temp==c) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not a Armstrong Number");
		}
	}

}
