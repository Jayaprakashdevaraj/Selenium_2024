package week4.assignment;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="Jayaprakash";
		char[] charArray = s.toCharArray();
		Set<Character> charSet  = new HashSet<Character>();
		
		for(char c : charArray) {
			charSet.add(c);
		}
	
		System.out.println("Unique char is "+charSet);

	}



}
