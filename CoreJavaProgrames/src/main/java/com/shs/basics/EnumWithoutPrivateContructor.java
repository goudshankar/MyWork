package com.shs.basics;
public class EnumWithoutPrivateContructor {


enum Season{
	WINTER(3),SUMMER(4),SPRING(5),FALL(6);
	
	private int value;
	public int getValue() {
		return value;
	}
	Season(int value){
		this.value=value;
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Season[] seasons=Season.values();
		for(Season s:seasons) {
			System.out.println("name:"+s.name()+"==="+"value:"+s.getValue());
		}
	}

}
