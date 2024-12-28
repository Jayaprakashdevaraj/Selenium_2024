package week1.day2;

import net.bytebuddy.implementation.bytecode.Division;

public class Calculator {
	public int add(int a, int b) {
		int c = a + b;
		return c;
	}

	public float sub(int a, float b) {
		float c = a - b;
		return c;
	}

	public String multiple(float a, int b, float c) {
		float d =a*b*c;
		String output = "the multiple of a as "+a+", b as "+b+", c as "+c+" is d as"+d;
		return output;
		

	}

	public float division(int a, int b) {
		return a/b;
		
	}
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.add(5, 5));
		System.out.println(cal.add(10,7));
		float subResult = cal.sub(10, 3.5f);
		System.out.println(subResult);
		String multipleResult = cal.multiple(2.3f, 10,5.3f);
		System.out.println(multipleResult);
		System.out.println(cal.division(10,2));
	}

}
