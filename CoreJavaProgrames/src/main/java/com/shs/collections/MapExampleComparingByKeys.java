package com.shs.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExampleComparingByKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(101, "Amit");
		map.put(103, "Vijay");
		map.put(102, "Ajay");
		//traversing the elements from the map
		/*map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey())
		.forEach(System.out::println);*/
		Set set=map.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}

}
