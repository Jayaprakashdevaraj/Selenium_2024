package week3.day1;

public class CheckCommonNUmberInTwoArrays {
	public static void main(String[] args) {
		int[] num1= {1,2,6,9,3,7};
		int[] num2= {2,6,4,8,0,5,11,17,19};
		
		for(int i=0; i<num1.length;i++) {
			for(int j=0; j<num2.length;j++) {
				if(num1[i]==num2[j]) {
					System.out.println(num1[i]+" is common numner in bith arrays");
				}
			}
		}
	}

}
