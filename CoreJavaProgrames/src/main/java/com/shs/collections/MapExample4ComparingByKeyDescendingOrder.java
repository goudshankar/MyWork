package com.shs.collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapExample4ComparingByKeyDescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(101, "Vijay");
		map.put(102,"Ajay");
		map.put(103, "Rahul");
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
		.forEach(System.out::println);
	}

}
