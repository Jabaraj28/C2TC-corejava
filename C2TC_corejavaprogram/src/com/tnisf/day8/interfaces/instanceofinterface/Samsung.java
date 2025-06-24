package com.tnisf.day8.interfaces.instanceofinterface;

public class Samsung implements Phone{
	@Override
	public void call() {
		System.out.println("Calling using samsung");
	}
	
	@Override
	public void sms() {
		System.out.println("Message using samsung");
	}

}
