package com.shs.opps;

public class InitializationBlockBike {
	int speed;
	InitializationBlockBike(){
		System.out.println("speed:"+speed);
	}
	{
		speed=100;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InitializationBlockBike bike=new InitializationBlockBike();
		
	}

}
