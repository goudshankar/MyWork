package com.shs.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample2NewStyle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"Virat");
		map.put(2,"Rohit");
		map.put(3,"Dhawan");
		//traverse the elements from the map but we can't traverse directly from the map for that
		//we need to covert into set
		Set set=map.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
