package com.shs.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		System.out.println("Initial elements of hm:"+hm);
		hm.put(100,"Vijay");
		hm.put(101,"Rahul");
		hm.put(102,"Ajay");
		System.out.println("After invoking the put() method:");
		for(Map.Entry m:hm.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
		hm.putIfAbsent(103, "shankar");
		System.out.println("After invoking the putIfAbsent() method:");
		for(Map.Entry m1:hm.entrySet())
			System.out.println(m1.getKey()+" "+m1.getValue());
		//putAll() method
		HashMap<Integer,String> map1=new HashMap<Integer,String>();
		map1.put(104, "Gaurav");
		map1.put(100,"Mukul");
		hm.putAll(map1);
		//keyBase removal
		hm.remove(100);
		//value based removal
		hm.remove("shankar");
		//key-value pari based removal
		hm.remove(103,"shankar");
		System.out.println("After invoking the remove() method:"+hm);
		/*for(Map.Entry m2:hm.entrySet())
			System.out.println(m2.getKey()+" "+m2.getValue());
		*/
		//replace the value based on key in different ways
		hm.replace(104,"shankar");
		//replace the old value with new value
		hm.replace(101, "Rahul","Vijay");
		//replaceAll with value
		hm.replaceAll((k,v)->"Ajay");
		System.out.println("After invoking the replace() method:"+hm);
	}

}
