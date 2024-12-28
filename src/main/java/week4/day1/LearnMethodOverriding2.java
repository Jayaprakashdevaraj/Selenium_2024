package week4.day1;

public class LearnMethodOverriding2 extends LearnMethodOverriding{
	public void takeSnap() {
		takeSnapAsPNG();
		
	}
	public void takeSnapAsPNG() {
		System.out.println("take snap as PNG format");
		
	}
	
	public static void main(String[] args) {
		LearnMethodOverriding2 or =new LearnMethodOverriding2();
		or.takeSnap();
		or.reportStep();
		
		
		
	}

}
