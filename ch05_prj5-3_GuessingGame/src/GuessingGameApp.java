import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Guess the Number Game\n" + "++++++++++++++++++++++++++++++++++++");

		Scanner sc = new Scanner(System.in);
		String choice = "y";
		final int LIMIT = 100;

		while (choice.equalsIgnoreCase("y")) {

			double d = Math.random() * LIMIT;
			int number = (int) d;
			number++;
			int guess = 0;
			int count = 0;
			boolean isCorrect = false;

			prompt();

			while (!isCorrect) {

				//Get a valid guess from the user and process whether it is correct
				guess = getIntWithinRange(sc, "Enter number: ", 1, 100);
				isCorrect = processGuess(guess, number);
				count++;
			}

			numberOfAttemptsMsg(count);
			choice = tryAgain(sc);
		}

		sc.close();
		System.out.println("\n Bye - Come back soon!");

	}

	public static void prompt() {
		System.out.println("\nI'm thinking of a number from 1 to 100.\n" + "Try to guess it.\n");
	}

	public static int getIntWithinRange(Scanner sc, String prompt, int min, int max) {

		int i = 0;
		while (true) {
			// print message to the user
			System.out.print(prompt);
			// get user input with data validation
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				if (i >= min && i <= max) {
					sc.nextLine(); // I was getting incorrect error output with valid guess followed by non int
					break;
				} else {
					System.out.println("Error - Enter a number between 1 to 100\n");
					sc.nextLine(); // discard bad data
				}
			} else {
				// re-prompt if bad data
				System.out.println("Error! Entry must be a whole number!\n");
				sc.nextLine(); // discard bad data
			}
		}
		// return valid input
		return i;

	}

	public static boolean processGuess(int guess, int number) {

		boolean correctGuess = false;

		if (guess == number) {
			correctGuess = true;
		} else if (guess > number) {
			if ((guess - number) > 10) {
				System.out.println("Way too high! Guess again.\n");
			} else {
				System.out.println("Too high! Guess again.\n");
			}
		} else {
			if ((number - guess) > 10) {
				System.out.println("Way too low! Guess again.\n");
			} else {
				System.out.println("Too low! Guess again.\n");
			}

		}

		return correctGuess;
	}

	public static String tryAgain(Scanner sc) {

		String choice = "";

		while (true) {

			System.out.print("\nTry again? (y/n) ");
			choice = sc.next();
			if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("n")) {
				break;
			} else {
				// re-prompt if bad data
				System.out.println("Error! Entry must be 'y' or 'n'. Try again");
				//sc.nextLine(); // discard bad data
			}

		}
		return choice;
	}

	public static void numberOfAttemptsMsg(int count) {
		System.out.println("You got it in " + count + " tries.");

		if (count <= 3) {
			System.out.println("Great work! You are a mathematical wizard.");
		} else if (count <= 7) {
			System.out.println("Not too bad! You've got some potential.");
		} else {
			System.out.println("What took you so long? Maybe you should take some lessons");
		}

	}
}
