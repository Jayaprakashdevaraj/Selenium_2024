package week4.day1;

public class Calculator {
	public void add(int a, int b) {
		int c= a+b;
		System.out.println("Addition of "+a+" and "+b+ " is "+c);
	}

	public void add(float a, float b) {
		float c= a+b;
		System.out.println(" Addition of "+a+" and "+b+ " is "+c);
	}
	public void add(int a, float b) {
		float c= a+b;
		System.out.println("Addition of "+a+" and "+b+ " is "+c);
	}
	public void add(int a, int b, int c) {
		int d= a+b+c;
		System.out.println("Addition of "+a+" and "+b+ " and "+c+" is "+d);
	}
	public void add(float a, int b, int c) {
		float d= a+b+c;
		System.out.println("Addition of "+a+" and "+b+ " and "+c+" is "+d);
	}
}
