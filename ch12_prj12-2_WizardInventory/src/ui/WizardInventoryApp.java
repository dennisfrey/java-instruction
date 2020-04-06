package ui;

import java.util.ArrayList;

import util.Console;

public class WizardInventoryApp {

	public static void main(String[] args) {
		System.out.println("The Wizard Inventory Game \n");
		System.out.println("COMMAND MENU\n" + "show - Show all items\n" + "grab - Grab an item\n"
				+ "edit - Edit an item\n" + "drop - Drop an item\n" + "exit - Exit program");

		ArrayList<String> inventory = new ArrayList<>(4);

		// set initial inventory
		inventory.add("wooden staff");
		inventory.add("wizard hat");
		inventory.add("cloth shoes");

		// ui
		String command = "";
		int position = 0;
		while (!command.equalsIgnoreCase("exit")) {
			command = Console.getString("\nCommand: ");

			if (command.equalsIgnoreCase("show")) {

				if (inventory.size()>0) {
				for (int i = 0; i < inventory.size(); i++) {
					System.out.println((i + 1) + ". " + inventory.get(i));
				}
				} else {
					System.out.println("Inventory is empty");
				}
			} else if (command.equalsIgnoreCase("grab")) {

				if (inventory.size() < 4) {
					inventory.add(Console.getString("Name: "));

				} else {
					System.out.println("You can't carry any more items. Drop something first.");
				}

			} else if (command.equalsIgnoreCase("edit")) {
				position = Console.getInt("Number: ", 0, inventory.size() + 1);
				inventory.set(position - 1, Console.getString("Updated name: "));
				System.out.println("Item number " + position + " was updated.");

			} else if (command.equalsIgnoreCase("drop")) {
				if (inventory.size()>0) {
				position = Console.getInt("Number: ", 0, inventory.size() + 1);
				System.out.println(inventory.get(position-1) + " was dropped");
				inventory.remove(position - 1);
				
				} else {
					System.out.println("Inventory is empty!");
				}

			} else if (command.equalsIgnoreCase("exit")) {
				continue;
			} else {
				System.out.println("Invalid Command!");
			}

		}

		System.out.println("Bye!");

	}

}
