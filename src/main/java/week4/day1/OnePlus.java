package week4.day1;

public class OnePlus extends Android{
	
	public void osType(){
		oxygenOS();
	}
	private void oxygenOS() {
		System.out.println("oneply support oxygen OS");
	}

	public static void main(String[] args) {
		OnePlus one = new OnePlus();
		one.defaultCallingApp();
		one.osType();
		one.voiceAssistance();
	}
}
