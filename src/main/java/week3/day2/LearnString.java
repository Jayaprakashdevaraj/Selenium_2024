package week3.day2;

import java.util.Arrays;

public class LearnString {
	public static void main(String[] args) {
		String input = "Welcome to testLeaf";
		
		int length = input.length();
		boolean equals = input.equals("Welcome");
		boolean equalsIgnoreCase = input.equalsIgnoreCase("testleaF");
		boolean contains = input.contains("to");
		
		
		System.out.println("the length of string is "+length);
		System.out.println("Is equal "+equals);
		System.out.println("equalsIgnoreCase "+equalsIgnoreCase);
		System.out.println("Is contains "+contains);
		
		char charAt1 = input.charAt(18);
		System.out.println(charAt1);
		String[] split = input.split("t");
		System.out.println(split[3]);
		System.out.println(input.toLowerCase());
		System.out.println(input.toUpperCase());
		System.out.println(input.concat(" , i joined here"));
		String replace = input.replace("e", "");
		System.out.println(replace);
		char[] charArray = input.toCharArray();
		String string = Arrays.toString(charArray);
		System.out.println(string);
	}

}
