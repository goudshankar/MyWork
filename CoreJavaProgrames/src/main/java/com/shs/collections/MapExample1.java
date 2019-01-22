package com.shs.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map=new HashMap();
		map.put(1,"sachin");
		map.put(2, "Virat");
		map.put(3,"rohit");
		//Traverse the elements from the map for that we need to convert map to set
		Set set=map.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry=(Map.Entry)itr.next();
		System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
