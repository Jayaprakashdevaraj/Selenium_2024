package week4.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {
	public static void main(String[] args) {

		int[] a = {3, 2, 11, 4, 6, 7 };

	

		List<Integer> listA = new ArrayList();
		for (int i = 0; i < a.length; i++) {

			listA.add(a[i]);
		}
		System.out.println(listA);
		Collections.sort(listA);
		System.out.println(listA);
		System.out.println("Secont largest number is " +listA.get(listA.size()-2));
	}

}
