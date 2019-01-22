package com.shs.collections;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();
		lhm.put(101, "Vijay");
		lhm.put(103,"Ajay");
		lhm.put(102,"Rahul");
		//fetching keys
		System.out.println("Keys:"+lhm.keySet());
		//fetching values
		System.out.println("Values:"+lhm.values());
		//fetching key-value pairs
		System.out.println("Key-value pairs:"+lhm.entrySet());
		//remove based on key
		lhm.remove(103);
		System.out.println(lhm);
		//remove key-value parie
		lhm.remove(102,"Rahul");
		System.out.println(lhm);
	}

}
