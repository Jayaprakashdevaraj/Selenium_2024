package week3.day1;

public class LearnString {
	
	public static void main(String[] args) {
		
	
	String name1= "TestLeaf";
	String name2= "TestLeaf";
	System.out.println(name1==name2);
	String name3 = new String("TestLeaf");
	String name4= "tEstLeaf";
	
	System.out.println(name1==name3);
	System.out.println(name1.length());
	System.out.println(name1.equals(name3));
	System.out.println(name1.equalsIgnoreCase(name4));
	System.out.println(name1.contains("Test"));
	System.out.println(name1.charAt(3));
	}
}
