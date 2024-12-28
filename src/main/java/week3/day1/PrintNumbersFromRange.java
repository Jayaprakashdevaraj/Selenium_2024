package week3.day1;

public class PrintNumbersFromRange {
	public void checkNumberIsOddorEven(int startRange, int endRange) {
		for (int i = startRange; i < endRange; i++) {
			if (i % 2 == 0) {
				System.out.println("The Number " + i + " is Even");
			} else {
				System.out.println("The Number " + i + " is odd");
			}
		}
	}

	public static void main(String[] args) {
		PrintNumbersFromRange num = new PrintNumbersFromRange();
		num.checkNumberIsOddorEven(15, 37);
	}
}
