package week3.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1= "Stops";
		String s2 ="potSs";
		int l1 = s1.length();
		int l2 = s2.length();
		if(l1==l2) {
			char[] charArray1 = s1.toCharArray();
			char[] charArray2 = s2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			boolean output = Arrays.equals(charArray1, charArray2);
			if(output) {
				System.out.println("The given strings are Anagram.");
			}else { 
				System.out.println("The given strings are not an Anagram." );
				
			}
			
		}else {
		System.out.println("Lent is mismatching. given text is not Anagram");
	}

}

}
