package week3.day1;

import java.util.Arrays;

public class LearnArrays {
	public static void main(String[] args) {
		//Array Literal ---> datatype[] varianleName={value with comma separator};
		
		long[] phoneNumbers = {8122212313l,1234567890l,1234567810l,1234567890l,1233214123l};
		System.out.println(phoneNumbers); // print memory info
		System.out.println(phoneNumbers[0]); //print stored info
		for(int i=0; i<phoneNumbers.length;i++) {
			System.out.println(phoneNumbers[i]);
		}
		
		//Array instantiation ---> datatype[] varianleName= new datatype[size];
		int[] numbers = new int [7];
		numbers[0]=2;
		numbers[1]=7;
		numbers[2]=5;
		numbers[3]=1;
		numbers[4]=6;
		numbers[5]=3;
		numbers[6]=4;
		System.out.println(numbers[5]);
		for(int i=0;i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("------Sort-----");
		Arrays.sort(numbers);
		for(int i=0;i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

}
