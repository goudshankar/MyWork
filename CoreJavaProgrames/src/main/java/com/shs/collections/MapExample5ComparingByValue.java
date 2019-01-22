package com.shs.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample5ComparingByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"A");
		map.put(2, "D");
		map.put(3, "C");
		map.put(4,"B");
		map.put(5,"E");
		//traverse the elements from the map
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue())
		.forEach(System.out::println);
	}

}
