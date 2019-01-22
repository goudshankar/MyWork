package com.shs.basics;
/* switch stmt is fall-through i.e it'll execute all the stmts after the first match if the break stmt is not present*/
public class SwitchFall_Through {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=10;
		switch(number) {
		case 10:System.out.println("10");
		//break;
		case 20:System.out.println("20");
		case 30:System.out.println("30");
		default:System.out.println("Invalid Number");
		}
	}

}
