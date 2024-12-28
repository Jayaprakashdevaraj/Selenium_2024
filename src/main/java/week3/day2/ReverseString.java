package week3.day2;

import java.util.Arrays;

public class ReverseString {
	public static void main(String[] args) {
		String input = "Hello World!";
		String expected = "!dlroW olleH";
		String output="";
		char[] charArray = input.toCharArray();
		for(int j=input.length()-1; j>=0;j--) {
			//System.out.print(charArray[j]);
			output=output+charArray[j];
		}
		if(expected.equals(output)) {
			System.out.println("Pass");
		}else
			System.out.println("Fail");
	}

}
