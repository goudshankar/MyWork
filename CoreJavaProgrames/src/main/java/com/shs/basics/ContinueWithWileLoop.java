package com.shs.basics;

public class ContinueWithWileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while(i<=10) {
			if(i==5) {
				i++;
				continue;
		
			}
			System.out.println(i);
			i++;
		}
	}

}
