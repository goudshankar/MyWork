package com.shs.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hset=new HashSet<String>();
		hset.add("One");
		hset.add("two");
		hset.add("three");
		hset.add("four");
		hset.add("six");
		hset.add("five");
		hset.add("eight");
		//traversing the elements from the hashSet
		Iterator<String> itr=hset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
