package com.shs.collections;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(100,"Roja");
		map.put(102,"Ramba");
		map.put(101,"Ramya");
		map.put(104,"soundarya");
		map.put(103,"Rasi");
		//traversing the sortedMap elements
		/*for(Map.Entry m:map.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
		*/
		System.out.println(map);
		System.out.println("HeadMap:"+map.headMap(102));
		System.out.println("TailMap:"+map.tailMap(102));
		System.out.println("subMap:"+map.subMap(101,103));
		
		
	}

}
