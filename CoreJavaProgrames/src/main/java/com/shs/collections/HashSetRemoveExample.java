package com.shs.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetRemoveExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hset=new HashSet<String>();
		hset.add("One");
		hset.add("two");
		hset.add("three");
		//remove an element from the hashSet
		hset.remove("two");
		HashSet<String> hset1=new HashSet<String>();
		hset1.add("two");
		hset1.add("zero");
		hset.addAll(hset1);
		System.out.println(hset);
		//remove 2nd list element
		hset.removeAll(hset1);
		System.out.println("After invoking the removeAll(collection c) method:"+hset);
		//remove if the list contains specied object
		hset.removeIf(str->str.contains("zero"));
		System.out.println("After invoking the removeIf() method:"+hset);
		//remove all the element from the hashSet
		hset.clear();
		System.out.println("After invoking the clear() method:"+hset);
		
	}

}
