package com.shs.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadInputByInputStreamReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("enter your name:");
		String name=br.readLine();
		System.out.println("Enter your address:");
		String address=br.readLine();
		System.out.println("Name is:"+name+" "+"address is:"+address);
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
