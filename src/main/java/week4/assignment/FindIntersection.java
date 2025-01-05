package week4.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindIntersection {
	public static void main(String[] args) {

		int[] a = { 3, 2, 11, 4, 6, 7 };

		int b[] = { 1, 2, 8, 4, 9, 7 };

		List<Integer> listA = new ArrayList();
		List<Integer> listB = new ArrayList();
		for (int i = 0; i < a.length; i++) {

			listA.add(a[i]);
		}

		for (int j = 0; j < a.length; j++) {

			listB.add(a[j]);
		}
		List<Integer> listC = new ArrayList(listA);
		listC.retainAll(listB);
		System.out.println(listC);
		
/*		if(listA.size()==listB.size()) {
			for(int z=0;z < a.size(); z++ ) {
				if(listA(z)==listB(z)) {
					System.out.println(listA(z)+" is matching with another array");
				}
			}
		}else {
			System.out.println("Given Array is not equal");
		}*/

	}
	}


