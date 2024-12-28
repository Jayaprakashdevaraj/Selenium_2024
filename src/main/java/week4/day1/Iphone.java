package week4.day1;

public abstract  class Iphone implements SmartPhone{

	@Override
	public void osType() {
	
		System.out.println("Run in iOS");
		
	}

	@Override
	public void voiceAssistance() {
		System.out.println("SIRI is voice assistance");
		
	}
	public abstract void chargingPort();
	
	public void frontCamera() {
		System.out.println("front camera is 16mp");
		
	}
	public void defaultCallingApp() {
		System.out.println("third part calling app");
		
	}

}
