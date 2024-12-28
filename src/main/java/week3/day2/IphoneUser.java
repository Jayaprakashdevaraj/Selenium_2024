package week3.day2;

public class IphoneUser {
	public static void main(String[] args) {
		Iphone16 ip16 = new Iphone16();
		Iphone15 ip15 = new Iphone15();
		
		System.out.println("----------------iPhone 16------------");
		ip16.frontCamera();
		ip16.backCamera();
		ip16.getBattery();
		ip16.getDisplay();
		
		System.out.println("----------------iPhone 15------------");
		ip15.frontCamera();
		ip15.backCamera();
		ip15.getBattery();
		ip15.getDisplay();
		
	}

}
