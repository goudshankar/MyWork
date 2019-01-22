package com.shs.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		set.add("One");
		set.add("two");
		set.add("One");
		//traversing the element from the LinkedHashSet
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
