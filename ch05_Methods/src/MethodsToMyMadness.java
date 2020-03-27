import java.util.InputMismatchException;
import java.util.Scanner;

public class MethodsToMyMadness {

	public static void main(String[] args) {
		System.out.println("Hello");
		Scanner sc = new Scanner(System.in);

		String name = "Dennis";

		// call welcome methods
		printWelcomeMessage();
		printWelcomeMessage(name);
		printWelcomeMessage("Roger Waters");

		// System.out.println("Enter 2 integers (ex 1 5): ");
		int a = getValidInt("Enter number 1 ", sc);
		int b = getValidInt("Enter number 2 ", sc);

		// get int a

		// get int b

		System.out.println("Sum is " + sum(a, b));
		System.out.println("Difference is " + diff(a, b));
		System.out.println("Quotient is " + quotient(a, b));
		System.out.println("Product is " + product(a, b));

		sc.close();
		System.out.println("Bye");
	}

	private static int getValidInt(String prompt, Scanner sc) {

		int i = 0;
		while (true) {
			// print message to the user
			System.out.print(prompt);
			try {
			// get user input
			i = sc.nextInt();
			break;
			}
			// check if there is an exception
			catch (InputMismatchException ime) {
				System.out.println("Error! Entry must be a whole number.");
				sc.nextLine(); // discard any input
			}
		

			// re-prompt if exception
		}
		// return valid input
		return i;

	}

	private static void printWelcomeMessage() {
		// private - cannot be called from other classes
		// void is the return type
		// no parameter
		System.out.println("Welcome to my madness!");
	}

	private static void printWelcomeMessage(String name) {
		// parameter string input
		System.out.println("Welcome, " + name + ", to my madness!");

	}

	private static int sum(int n1, int n2) {
		return n1 + n2;

	}

	// auto generated method using eclipse - highlight formula - right click -
	// refactor - extract method
	private static int diff(int a, int b) {
		return a - b;
	}

	private static int quotient(int a, int b) {
		return a / b;
	}

	private static int product(int a, int b) {
		return a * b;
	}
}
