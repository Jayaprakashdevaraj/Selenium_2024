package week3.day2;

public class CompanyNameReverseString {
	public static void main(String[] args) {
		
	
	String input = "Infosys";
	String expected = "sysofnI";
	String output="";
	char[] charArray = input.toCharArray();
	for(int j=input.length()-1; j>=0;j--) {
		output=output+charArray[j];
	}
	if(expected.equals(output)) {
		System.out.println("Verification Pass - Reversed ompany name is "+output);
	}else
		System.out.println("Verification Fail - Reversed ompany name is "+output);
}


}
