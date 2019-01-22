package com.shs.collections;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapExample {
	//create an enum
	public  enum Days{
		sun,mon,tue,wed,thu,fri,sat
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumMap<Days,String>map=new EnumMap<Days,String>(Days.class);
		map.put(Days.mon,"1");
		map.put(Days.tue,"2");
		map.put(Days.wed,"3");
		for(Map.Entry m:map.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
	}

}
