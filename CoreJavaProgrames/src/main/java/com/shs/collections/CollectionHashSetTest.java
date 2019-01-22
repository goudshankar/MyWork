package com.shs.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new HashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		//traversing the HashSet elements
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
