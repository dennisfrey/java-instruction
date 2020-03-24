package ch02_CalculatorBasic;

public class BasicCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Basic Calculator");
		// define some variables and print to console
		int n1 = 5;
		int n2 = 11;
		int n3 = n2;
		int n4 = n1 * n2;
		int n6 = 6;
		int n7 = 2;
		
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
		System.out.println("n3 = " + n3);
		System.out.println("n4 = " + n4);
			
		int result1 = n1 + n2;
		int result2 = n1 * n2;
		int result3 = n6 / n7;
		int result4 = n2 - n1;
				
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		System.out.println("result3 = " + result3);
		System.out.println("result4 = " + result4);
		
		double d1 = 9.9;
		int n8 = 3;
		double d2 = d1/n8;
		int n9 = (int)(d1/n8);
		System.out.println("d2 = " + d2);
		System.out.println("n9 = " + n9);
		
		System.out.println("Bye");

	}

}
