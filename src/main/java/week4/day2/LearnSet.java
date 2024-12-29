package week4.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.collections4.multimap.HashSetValuedHashMap;

public class LearnSet {
	public static void main(String[] args) {
		Set<String> hashSet = new HashSet();
		Set<String> linkedHashSet = new LinkedHashSet();
		Set<String> treeSet = new TreeSet();
		
		hashSet.add("jayaprakash");
		hashSet.add("Amala");
		hashSet.add("Pons");
		hashSet.add("Raja");
		hashSet.add("Amala");
		
		linkedHashSet.add("Keerthana");
		linkedHashSet.add("Nishanth");
		linkedHashSet.add("Priya");
		linkedHashSet.add("Roja");
		linkedHashSet.add("Keerthana");
		
		treeSet.add("Venkat");
		treeSet.add("Rahav");
		treeSet.add("Pavi");
		treeSet.add("Ramu");
		treeSet.add("Venkat");
		
		System.out.println("<----Hashset--->");
		System.out.println(hashSet);
		System.out.println("<----LInkedHashset--->");
		System.out.println(linkedHashSet);
		System.out.println("<----Treeset--->");
		System.out.println(treeSet);
		
		for(String localVariable : hashSet) {
			System.out.println(localVariable);
		}
		
		List<String> names = new ArrayList();
		names.addAll(treeSet);
		System.out.println(names);
		
	}

}
