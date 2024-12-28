package week4.day1;

public class Android implements SmartPhone{

	@Override
	public void osType() {
		System.out.println("Run in Android");
		
	}

	@Override
	public void voiceAssistance() {
		System.out.println("Google is voice assistance");		
	}
	@Override
	public void defaultCallingApp() {
		System.out.println("third part calling app");
		
	}

}
