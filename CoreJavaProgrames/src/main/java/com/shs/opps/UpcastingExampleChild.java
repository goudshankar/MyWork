package com.shs.opps;

public class UpcastingExampleChild extends UpcastingExampleParent  {
	void run() {
		System.out.println("Running safely with 5kmph");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UpcastingExampleParent uParent=new UpcastingExampleChild();
		uParent.run();
	}

}
