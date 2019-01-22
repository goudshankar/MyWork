package com.shs.basics.programes;
/* Palindrome Number check: A palindrome number is a number that is same after reverse
 * eg:545,151,343,48984
 * String:LOL,MADAM
 * */
public class PalindromeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,sum=0,temp;
		int  n=170;
		//hold the number in temp variable
		temp=n;	
		//reverse the number
		while(n>0) {	
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		//compare the temp number with reverse number
		if(temp==sum) {
			System.out.println("Palindrome Number");
		}
			else {
				System.out.println("Not a Palindrome Number");
			}
		}
	}


