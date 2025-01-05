package week4.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTheStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> company=  new ArrayList<String>();  
		company.add("HCL");
		company.add("Wipro");
		company.add("Aspire Systems");
		company.add("CTS");
		System.out.println(company);
		Collections.sort(company,  Collections.reverseOrder());
		System.out.println(company);
	}

}
