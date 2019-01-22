package com.shs.basics;

import java.util.Scanner;

public class SwitchWithNested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Your BranchCode:");
		String branch=scn.nextLine();
		int collegeYear=1;
		switch(collegeYear) {
		case 1:
			System.out.println("1st Year::English,Maths,Science");
			break;
		case 2:
			switch(branch) {
			case "CSE":
				System.out.println("2nd Year::OperatingSystem,Java,DataStructor");
				break;
			case "ECE":
				System.out.println("2nd Year::MicroProcessors,LogicalSwitchingTheory");
				break;
			case "Mech":
				System.out.println("2nd Year::Drawing,ManufactoringMachines");
				break;
			}//Inner switch1
			break;
		case 3:
			switch(branch) {
			case "CSE":
				System.out.println("3rd Year::ComputerOrganization,MultiMedia");
				break;
			case "ECE":
				System.out.println("3rd Year::FundamentalsOfLogicDesign,Microelectronics");
				break;
			case "Mech":
				System.out.println("3rd Year::Internal CombustionEngines,MechanicalVibration");
				break;
			}//inner Switch2
			break;
		case 4:
			switch(branch) {
			case "CSE":
				System.out.println("4th Year::DataCommunication and Networking,MultiMedia");
				break;
			case "ECE":
				System.out.println("4th Year::EmbeddedSystems,ImageProcessing");
				break;
			case "Mech":
				System.out.println("4th Year::ProductionTechnology,ThermalEngineering");
				break;
			}
			break;
		}//outer switch
	}//main(-)
		
}//class


