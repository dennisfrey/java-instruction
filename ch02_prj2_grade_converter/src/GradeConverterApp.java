import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Letter Grade Converter");
		
		Scanner sc = new Scanner(System.in);
		String response = "y";
		
		while (response.equalsIgnoreCase("y")) {
			
			System.out.print("Enter numerical grade: ");
			int numGrade = sc.nextInt();
			String grade = "";
			
			// Assumes user will enter valid integers between 1 and 100
			if (numGrade >= 88) {
				grade = "A";
			}
			else if (numGrade >= 80) {
				grade = "B";
			}
			else if (numGrade >= 67) {
				grade = "C";
			}
			else if (numGrade >= 60) {
				grade = "D";
			}
			else {
				grade = "F";
			}
			
			System.out.println("Letter grade: " + grade);
			System.out.print("Continue? (y/n): ");
			response = sc.next();
				
		}
		
		sc.close();

	}

}
