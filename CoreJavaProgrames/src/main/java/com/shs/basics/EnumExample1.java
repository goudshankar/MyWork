package com.shs.basics;

public class EnumExample1 {
	public enum Season{WINTER,SPRING,SUMMER,FALL}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//iterate the elements from season
		for(Season s:Season.values()) {
			System.out.println(s);
		}
		
	}

}
