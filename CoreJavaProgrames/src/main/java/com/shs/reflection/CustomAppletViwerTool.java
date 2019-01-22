package com.shs.reflection;

import java.applet.Applet;
import java.awt.Frame;
import java.awt.Graphics;

public class CustomAppletViwerTool extends Frame {

	public static void main(String[] args) {
		try {
		// TODO Auto-generated method stub
		Class c=Class.forName(args[0]);
		CustomAppletViwerTool v=new CustomAppletViwerTool();
		v.setSize(400,400);
		v.setLayout(null);
		v.setVisible(true);
		Applet a=(Applet)c.newInstance();
		a.start();
		Graphics g=v.getGraphics();
		a.paint(g);
		a.stop();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
