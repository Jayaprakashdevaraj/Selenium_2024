package week4.assignment;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		
	
	String s ="PayPal India";
	char[] charArray = s.toCharArray();
	Set<Character> charSet  = new LinkedHashSet<Character>();
	Set<Character> dupCharSet  = new LinkedHashSet<Character>();
	for(int i=0; i<charArray.length;i++) {
		if(!charSet.add(charArray[i])) {
			dupCharSet.add(charArray[i]);
		}
		
	}
	System.out.println("Unique char is "+charSet);
	System.out.println("Duplicate char is "+dupCharSet);
	

	}
}
