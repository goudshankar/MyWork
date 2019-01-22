package com.shs.collections;

import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(1,"A");
		ht.put(2,"B");
		ht.put(3,"C");
		ht.put(4,"D");
		ht.put(5,"E");
/*		for(Map.Entry m:ht.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());*/
		System.out.println(ht);
		//traverse an elements from the hashtable
		ht.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey())
		.forEach(System.out::println);
	}

}
