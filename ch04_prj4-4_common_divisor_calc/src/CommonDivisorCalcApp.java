import java.util.Scanner;

public class CommonDivisorCalcApp {

	public static void main(String[] args) {
		System.out.println("Greatest Common Divisor Finder");
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			
			// Prompt for first and second numbers
			System.out.print("\nEnter first number: ");
			int firstNumber = sc.nextInt();
			
			System.out.print("Enter second number: ");
			int secondNumber = sc.nextInt();
			
			// Continue subtracting one from the other until firstNumber = 0
			while (firstNumber!=0) {
				
				//subtract 1st number from 2nd number until 2nd number < 1st number
				while (secondNumber>=firstNumber) {
					secondNumber = secondNumber - firstNumber;	
				}
				//swap values after exiting nested while
				int tempNumber = firstNumber;
				firstNumber = secondNumber;
				secondNumber = tempNumber;		
			}
			
			System.out.println("Greatest common divisor: " + secondNumber);				
			System.out.print("\nContinue? (y/n): ");
			choice = sc.next();
			
		}
		
		sc.close();
		System.out.println("Bye!");
		
	}

}
