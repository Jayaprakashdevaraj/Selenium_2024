package week3.day1;

import java.util.Arrays;

public class PrintDuplicateNumber {
	public static void main(String[] args) {
		int[] num = { 2, 5, 7, 7, 5, 9, 2, 3 };
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length - 1; j++) {
				if (num[i] == num[j]) {
					System.out.println(num[i] + " is duplicate number");
				}

			}
		} 
		System.out.println("------------method 2------------");
		
		Arrays.sort(num);
		for (int x = 0; x < num.length-1; x++) {
			if(num[x]==num[x+1]) {
				System.out.println(num[x]);
			}
		}
	}

}
