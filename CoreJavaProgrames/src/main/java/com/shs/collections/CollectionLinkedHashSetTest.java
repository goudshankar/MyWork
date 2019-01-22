package com.shs.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionLinkedHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new LinkedHashSet<String>();
		set.add("Raja");
		set.add("Ravi");
		set.add("Raja");
		set.add("Vijay");
		Iterator<String> itr=set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}

}
