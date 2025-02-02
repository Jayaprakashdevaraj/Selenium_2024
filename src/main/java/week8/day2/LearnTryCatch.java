package week8.day2;

public class LearnTryCatch {
	public static void main(String[] args) {
		int a=1;
		int b=0;
		
		try {
			System.out.println(a/b);
		} catch (Exception e) {
			System.out.println("this is catch block");
			
		}
	}

}
