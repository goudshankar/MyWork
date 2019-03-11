package com.shs.collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortMapByKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> umap=new HashMap<Integer,String>();
		umap.put(1, "one");
		umap.put(3,"Three");
		umap.put(2,"Two");
		umap.put(5,"Five");
		umap.put(4, "Four");
		System.out.println("Before sorting:");
		printMap(umap);
		Map<Integer,String> smap=new TreeMap<Integer,String>(new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}

			
		});
		smap.putAll(smap);
		System.out.println("After sorting:");
		printMap(smap);
	}
	
	public static <K,V> void printMap(Map<K,V> map) {
		for(Map.Entry<K, V> entry:map.entrySet()) {
			System.out.println(entry.getKey()+"===="+entry.getValue());
		}
	
	}
 
}
