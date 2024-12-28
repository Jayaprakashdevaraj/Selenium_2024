package week1.day2;

public class LearnIfCondition {
	public static void main(String[] args) {
		
		boolean flag = true;
		if(flag) {
			System.out.println("if confition is sattisfied");
		}
		int a =2;
		int b=3;
		int c= 5;
		if(a==b) {
			System.out.println("Boath A and B are same");
		}else {
			System.out.println("Both A and B are different");
		}
		
		if((a>b)&&(b>c)) {
			System.out.println("A is greater than B and C");
		}else if((b>a)&&(b>c)) {
			System.out.println("B is greater than A and C");
		}else if((a<c)&&(b<c)) {
		System.out.println("C is greater than A and B");
		}else {
			System.out.println("the above conditions is not satisfied");
		}
		
		if((a>b)||(b>c)) {
			System.out.println("a is greater than b and c");
		}else if((a>c)||(c>b)) {
			System.out.println("c is greater than b and a");
		}
			
		System.out.println("<---End--->");
	}

}
