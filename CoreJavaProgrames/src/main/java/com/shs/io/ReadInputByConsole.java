package com.shs.io;

import java.io.Console;

public class ReadInputByConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console con=System.console();
		System.out.println("Enter your name:");
		String name=con.readLine();
		System.out.println("welcome:"+name);
		//String pwd=con.readLine();
		//System.out.println("Your name is:"+name +"and your password is:"+pwd );
	}

}
