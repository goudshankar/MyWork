package com.shs.collections;

import java.util.EnumSet;
import java.util.Set;

enum days1{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THUSDAY,FRIDAY,SATURDAY
}
public class EnumSetExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<days1> set=EnumSet.allOf(days1.class);
		System.out.println("week Days:"+set);
		Set<days1> set1=EnumSet.noneOf(days1.class);
		
	}

}
