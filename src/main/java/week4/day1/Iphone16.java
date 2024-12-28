package week4.day1;

public class Iphone16 extends Iphone{

	@Override
	public void chargingPort() {
		System.out.println("C type chager ");
	}
	
	public static void main(String[] args) {
		Iphone16 ip = new Iphone16();
		ip.osType();
		ip.voiceAssistance();
		ip.chargingPort();
		ip.frontCamera();
	}


}
