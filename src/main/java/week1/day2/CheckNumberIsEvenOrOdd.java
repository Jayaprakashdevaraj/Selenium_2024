package week1.day2;

public class CheckNumberIsEvenOrOdd {
	public void checkNumber(int a) {
		if(a%2==0) {
			System.out.println("The number "+a+" is even");
		}else
			System.out.println("The number "+a+" is odd");
	}
	
	public static void main(String[] args) {
		CheckNumberIsEvenOrOdd num = new CheckNumberIsEvenOrOdd();
		num.checkNumber(3);
		num.checkNumber(10);
	}

}
