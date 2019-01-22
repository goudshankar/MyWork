package com.shs.basics;

public class EnumWithSpecificValues {
	
	enum Season{
		
		WINTER(10),SUMMER(5),FALL(20),SPRING(15);
		
		private int value;
		
		public int getValue() {
			return value;
		}

		private Season(int value) {
			this.value=value;
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Season s:Season.values()) {
			System.out.println(s+"=="+s.value);
		}
	}

}
