package com.shs.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String>map=new TreeMap<Integer,String>();
		map.put(100,"Vijay");
		map.put(101,"Amit");
		map.put(103,"Rahul");
		map.put(102,"Ravi");
		//Traversing the treeMap elements
		for(Map.Entry m:map.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
		//remove based on key
		map.remove(103);
		System.out.println("After removing the elemnts of map"+map);
	}

}
