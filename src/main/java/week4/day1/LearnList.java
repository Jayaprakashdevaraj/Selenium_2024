package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LearnList {
	
	public static void main(String[] args) {
		
		List<Integer> phoneNumbers = new ArrayList<Integer>();
		
		phoneNumbers.add(123);
		phoneNumbers.add(123);
		phoneNumbers.add(124);
		phoneNumbers.add(125);
		phoneNumbers.add(126);
		phoneNumbers.add(123);
		phoneNumbers.add((int) 1234567890l); //type casting
		System.out.println(phoneNumbers);
		phoneNumbers.add(3, 222);
		phoneNumbers.remove(1);
		System.out.println(phoneNumbers);
		System.out.println(phoneNumbers.size());
		Collections.sort(phoneNumbers);
		System.out.println(phoneNumbers);
		
		System.out.println("<-----LinkedList------>");
		
		List<Integer> numbers = new LinkedList<Integer>();
		numbers.addAll(phoneNumbers);
		System.out.println(numbers);
		numbers.addAll(3, numbers);
		System.out.println(numbers);
		System.out.println(numbers.size());
		System.out.println(numbers.get(2));
	}

}
