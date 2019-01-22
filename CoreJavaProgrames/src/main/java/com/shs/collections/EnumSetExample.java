package com.shs.collections;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THUSDAY,FRIDAY,SATURDAY
}
public class EnumSetExample {
	public static void main(String[] args) {
		Set<days> set=EnumSet.of(days.TUESDAY,days.WEDNESDAY);
		//traversing the elements from the enumSet
		Iterator<days> itr=set.iterator();
		while(itr.hasNext())
		System.out.println(itr.next());
	}
}
