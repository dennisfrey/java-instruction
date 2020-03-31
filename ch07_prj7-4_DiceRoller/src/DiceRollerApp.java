import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Dice Roller!");
		String choice = "y";
		Scanner sc = new Scanner(System.in);

		while (true) {
			choice = rollDicePrompt(sc);
			if (choice.equalsIgnoreCase("y")) {
				Dice dice = new Dice();
				dice.roll();
				dice.printRoll();
				
				if (dice.getSum() == 12) {
					System.out.println("Box cars!");
				} else if (dice.getSum() == 7) {
					System.out.println("Craps!");
				} else if (dice.getSum() == 2) {
					System.out.println("Snake eyes!");
				}

			} else {
				break;
			}

		}
		sc.close();
		System.out.println("\nGoodbye!");

	}

	public static String rollDicePrompt(Scanner sc) {

		String choice = "";

		while (true) {

			System.out.print("\nRoll the dice? (y/n) ");
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
