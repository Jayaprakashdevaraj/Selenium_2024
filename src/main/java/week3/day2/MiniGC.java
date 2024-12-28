package week3.day2;

public class MiniGC extends CarP{
	public void increaseSpeed() {
		System.out.println("Increase the car speed");
	}
	public static void main(String[] args) {
		MiniGC gc = new MiniGC();
		gc.increaseSpeed();
		gc.applyBreak();
		gc.startCar();
	}

}
