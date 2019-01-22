package com.shs.opps;

public class InstanceBlock2D extends InstanceBlock2C {
	InstanceBlock2D(){
		System.out.println("child class constructor");
	}
	{
		System.out.println("Instance initializer is invoked");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceBlock2D object=new InstanceBlock2D();
		
	}

}
