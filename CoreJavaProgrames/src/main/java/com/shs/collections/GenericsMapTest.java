package com.shs.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GenericsMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String>map=new HashMap<Integer,String>();
		map.put(1,"vijay");
		map.put(2,"Amit");
		map.put(3,"Ankur");
		//create Map.Entry for set and Iterator
		Set<Map.Entry<Integer,String>>set=map.entrySet();
		Iterator<Map.Entry<Integer,String>> itr=set.iterator();
		while(itr.hasNext()) {
			Map.Entry e=itr.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
