package com.shs.collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapExample6ComparingByValueDescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "A");
		map.put(2,"B");
		map.put(3,"C");
		map.put(4,"D");
		//traverse the elements from the map
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		.forEach(System.out::println);
	}

}
