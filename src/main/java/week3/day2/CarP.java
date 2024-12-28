package week3.day2;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

public class CarP extends VehicleGP {
	int noOfSeat = 5;
	int noOfWheel = 4;
	
	public void startCar() {
		System.out.println("start the car");
	}
	
	public static void main(String[] args) {
		CarP p = new CarP();
		System.out.println("no of seats "+p.noOfSeat);
		System.out.println("no of seats "+p.noOfWheel);
		
		
	}
 

}
