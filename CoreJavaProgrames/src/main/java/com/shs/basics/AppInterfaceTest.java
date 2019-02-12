package com.shs.basics;

public class AppInterfaceTest {
	
	
	private static AppInterface appInterface;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		appInterface=new AppInterfaceService().getObjectDetails();
		if(appInterface instanceof CapgeminiEmp) {
			System.out.println("Capgemnini");
			appInterface.getEmpDetails();
		}
		else if(appInterface instanceof SyntelEmp){
			System.out.println("Syntel");
			appInterface.getEmpDetails();
		}
	}

}
