package week3.day1;

import java.util.Iterator;

public class FindOddNumber {

	public static void main(String[] args) {
		
		FindOddNumber num = new FindOddNumber();
		num.number(10);

	}
	
	public void number(int maxRange) {
		for(int x=1; x<maxRange; x++) {
			if(x%2!=0) {
				System.out.println("The number "+x+" is odd");
			}
		}
	}

}
