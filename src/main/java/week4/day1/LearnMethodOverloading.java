package week4.day1;

public class LearnMethodOverloading {
	
	public void reportStep(String msg, String status) {
		System.out.println("message as "+msg+" and test status is "+status);
		
	}
public void reportStep(String msg, String status, boolean snap) {
	System.out.println("message as "+msg+" and test status is "+status+" and boolean value is "+snap);
	}

public static void main(String[] args) {
	LearnMethodOverloading ol = new LearnMethodOverloading();
	ol.reportStep("testing is done", "Pass");
	ol.reportStep("Testing done", "Pass", true);
}
}
