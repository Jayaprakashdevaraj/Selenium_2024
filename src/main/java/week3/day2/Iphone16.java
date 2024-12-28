package week3.day2;

public class Iphone16 implements Camera, Battery, Display  {

	@Override
	public void getDisplay() {
System.out.println("DIsplay size 6.1");
		
	}

	@Override
	public void getBattery() {
		System.out.println("Batter size is 4000 mAh");
		
	}

	@Override
	public void frontCamera() {
		System.out.println("Front camera is 12MP");
		
	}

	@Override
	public void backCamera() {
		System.out.println("Back camera is 10MP");
		
	}


}
