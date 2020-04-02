import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Dice Roller!");
		Scanner sc = new Scanner(System.in);
		String choice = rollDicePrompt(sc, "\nRoll the dice? (y/n): ");

		while (true) {
			if (choice.equalsIgnoreCase("y")) {
				Dice dice = new Dice();
				dice.roll();
				dice.printRoll();

			} else {
				break;
			}
			choice = rollDicePrompt(sc, "\nRoll again? (y/n): ");
		}
		sc.close();
		System.out.println("\nGoodbye!");

	}

	public static String rollDicePrompt(Scanner sc, String prompt) {

		String choice = "";

		while (true) {

			System.out.print(prompt);
			choice = sc.next();
			if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("n")) {
				break;
			} else {
				// re-prompt if bad data
				System.out.println("Error! Entry must be 'y' or 'n'. Try again");
				// sc.nextLine(); // discard bad data
			}

		}
		return choice;
	}

}
