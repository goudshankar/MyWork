package com.shs.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		set.add("One");
		set.add("Zero");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		//traversing the elemnts from the linkedHashSet
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
