package week4.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FindMissingNumber {
	public static void main(String[] args) {

		int[] a = {1, 2, 3, 4, 10, 6, 8 };

		List<Integer> listA = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {

			listA.add(a[i]);
		}
		Collections.sort(listA);
		System.out.println(listA);
/*		for(int j=0;j<=listA.size()-2;j++) {
			if(listA(j)==listB(j+1)) {
				System.out.println("The gap index is "+listA.get(j));
			}
		}*/
	}

	



}
