package week3.assignment;

public class ChangeOddIndexToUppercase {
	public static void main(String[] args) {
		String test = "changeme";
		System.out.println(ChangeOddIndex(test));
		
	}
	public static String ChangeOddIndex(String test) {
		//String output = "";
		StringBuilder sb = new StringBuilder();
		char[] charArray = test.toCharArray();
		for(int i=0; i<=charArray.length;i++) {
			char c = test.charAt(i);
			if(i%2!=0) {
				char upperCase = Character.toUpperCase(c);
				sb.append(upperCase);
			}else {
				sb.append(c);
			}
			
		}
		return sb.toString();

	}

}
