package com.shs.basics;

enum TraficSignals{
	RED("STOP"),GREEN("GO"),ORANGE("SLOW DOWN");
	
	private String action;
	public String getAction() {
		return action;
	}
	private TraficSignals(String action) 
	{
		this.action=action;
	}
}

public class EnumWithSpecificValues2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TraficSignals[] signals=TraficSignals.values();
		for(TraficSignals signal:signals) {
			System.out.println("name:"+signal.name()+"	==	action:"+signal.getAction());
		}
	}	

}
