package com.shs.collections;

import java.util.ArrayList;

public class ArrayListIsEmptyExample {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Vijay");
		al.add("Ajay");
		System.out.println("After insertion:");
		System.out.println("Is arrayList is Empty:"+al.isEmpty());
	}

}
