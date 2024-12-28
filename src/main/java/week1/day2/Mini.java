package week1.day2;

public class Mini {
	String brandName = "Mini";
	String modelName;
	String carColor;
	int noOfWheels = 4;
	int noOfMirror = 2;
	int noOfDoors = 4;
	
	public void startCar() {
		System.out.println("Start the car");
		
	}
	
	public void driveCar() {
		System.out.println("Drive the car");
		
	}
	public void applyBread() {
		System.out.println("Apply break");
		
	}
	public void increaseSpeed() {
		System.out.println("Increase speed");
	}
	public void changrGear() {
		System.out.println("Change gear");
	}
	public void coopers() {
		System.out.println("Brand name is "+brandName);
		System.out.println("model name is  " +modelName);
		System.out.println("color of the car is  " +carColor);
		System.out.println("no of wheels "+noOfWheels);
		System.out.println("no of mirror is "+noOfMirror);
		System.out.println("no of doors is "+noOfDoors);
	}
	public void countryMan() {
		System.out.println("Brand name is "+brandName);
		System.out.println("model name is  " +modelName);
		System.out.println("color of the car is  " +carColor);
		System.out.println("no of wheels "+noOfWheels);
		System.out.println("no of mirror is "+noOfMirror);
		System.out.println("no of doors is "+noOfDoors);
	}
	
	public static void main(String[] args) {
		Mini jp = new Mini();
		jp.coopers();
		
//		jp.modelName= "cooperS";
//		jp.carColor = "Blue";
	}

}
