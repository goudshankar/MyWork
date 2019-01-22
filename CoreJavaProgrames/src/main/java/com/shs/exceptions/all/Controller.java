package com.shs.exceptions.all;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Controller {

	public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		Object ob=null;
		System.out.println("Enter a Number or String");
		String input=scn.next();
		
		if(Pattern.matches("[0-9]", input)) {
			ob=Integer.parseInt(input);
		}else {
		ob=input;
		}
		getSalery(ob);
	}

	public static void getSalery(Object ob) {

		Service service = new Service();
		try {
			service.getSalery(ob);
		} catch (AppException e) {
			if (e.getMessage().equals("0001")) {

				System.out.println("Arithmetic Exception Handled");
			}
			if (e.getMessage().equals("0002")) {

				System.out.println("Nullpointer Exception Handled");
			}

		}
	}

}
