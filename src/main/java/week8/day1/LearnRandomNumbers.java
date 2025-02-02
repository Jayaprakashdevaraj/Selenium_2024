package week8.day1;

public class LearnRandomNumbers {
	
	public static void main(String[] args) {
		int num1 = (int)(Math.random()*999999);
		int num2 = (int)(Math.random()*999999);
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(""+num1+num2);
		String phNo = "9"+num1+num2;
		String substring = phNo.substring(5);
		System.out.println(substring);
	}

}
