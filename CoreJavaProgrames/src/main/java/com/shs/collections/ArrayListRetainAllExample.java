package com.shs.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRetainAllExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("Ajay");
		al2.add("Hanmat");
		al2.add("Vijay");
		al.retainAll(al2);
		System.out.println("iterating the elements after retaining the elements of al2:");
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
