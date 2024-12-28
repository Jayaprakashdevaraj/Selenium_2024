package week4.day1;

public interface SmartPhone {
	public void osType();
	
	public void voiceAssistance();
	
	public void defaultCallingApp();
	
	default void makeCall() {
		defaultCallingApp();
	}

}
