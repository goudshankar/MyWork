package com.shs.collections;

import java.util.ArrayList;

public class ArrayListSetAndGetExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("Manoj");
		al.add("kedar");
		System.out.println("Before updated:"+al.get(1));
		//update an element at specied position
		al.set(1, "shankar");
		System.out.println("After updating the element:"+al.get(1));
		System.out.println(al);
	}

}
