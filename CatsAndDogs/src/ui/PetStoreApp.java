package ui;

import java.util.ArrayList;

import db.Pet;
import util.Console;

public class PetStoreApp {

	private static ArrayList<Pet> pets = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("Welcome to the PetStoreApp!");
		System.out.println("\nThis application will manage a list of pets. " + "\nYou can add pets to the inventory,"
				+ "\nand remove them when they get adopted.\n");

		String command = "";

		// initializing 2 pets
		Pet pet1 = new Pet(1, "Snake", "Eyelash Viper", "Snippy", 3);
		Pet pet2 = new Pet(2, "Snake", "King Cobra", "Bitey", 7);

		// Adding the 2 pets to the list
		pets.add(pet1);
		pets.add(pet2);

		displayMenu();

		// Loop to get user commands
		while (!command.equalsIgnoreCase("exit")) {

			// get command from user
			command = Console.getString("\nCommand: ", true);

			// process command
			switch (command) {
			case "list":
				displayPets();
				break;
			case "add":
				addPet();
				break;
			case "adopt":
				adoptPet();
				break;
			case "exit":
				break;
			default:
				System.out.println("Invalid Command!");
			}
		}

		System.out.println("\nBye!");

	}

	private static void displayMenu() {

		StringBuilder menu = new StringBuilder("COMMAND MENU:\n");
		menu.append("=============\n");
		menu.append("list   - List all pets\n");
		menu.append("add    - Add pet to inventory\n");
		menu.append("adopt  - Remove adopted pet from inventory\n");
		menu.append("exit   - Exit the application");
		System.out.println(menu);
	}

	public static void displayPets() {
		System.out.println("\nPet Inventory");
		System.out.println("-------------");
		// Display pets in inventory unless inventory is empty
		if (pets.size() > 0) {
			for (Pet p : pets) {
				System.out.println(p);
			}
		} else {
			System.out.println("Inventory is empty");
		}
	}

	public static void addPet() {

		Pet pet = new Pet();
		int id = 0;
		boolean success;

		System.out.println("\nAdd a pet");
		System.out.println("---------");

		// while loop is to prevent adding duplicate id
		while (true) {
			boolean inUse = false;
			id = Console.getInt("Id? ", 0, (int) Double.POSITIVE_INFINITY);
			for (Pet p : pets) {
				if (p.getId() == id) {
					System.out.println("Error - ID already taken.  Please try another ID!");
					inUse = true;
				}
			}
			if (!inUse) {
				break;
			}

		}
		// set id and get remaining inputs for pet
		pet.setId(id);
		pet.setType(Console.getString("Type? ", true));
		pet.setSpecies(Console.getString("Species? ", true));
		pet.setName(Console.getString("Name? ", true));
		pet.setAge(Console.getInt("Age? ", 0, (int) Double.POSITIVE_INFINITY));
		success = pets.add(pet);

		// confirmation message
		if (success) {
			System.out.println("\n" + pet.getName() + " (" + pet.getSpecies() + ") was added to the inventory.");
		} else {
			System.out.println("You have failed at life");
		}

	}

	public static void adoptPet() {

		Pet pet = null;
		boolean success;
		String petName = "";
		System.out.println("\nPet Adoption");
		System.out.println("------------");

		// check first for pets in inventory and display message if empty
		if (pets.size() > 0) {

			// get valid id for a pet in the inventory
			while (pet == null) {
				int id = Console.getInt("Id of pet to adopt? ");

				for (Pet p : pets) {
					if (p.getId() == id) {
						pet = p;
					}
				}
				if (pet == null) {
					System.out.println("Invalid ID. Try again.");
				}

			}
			// Saving the name to use in confirmation message
			petName = pet.getName();

			// Remove adopted pet
			success = pets.remove(pet);

			// confirmation message
			if (success) {
				System.out.println("\n" + petName + " (" + pet.getSpecies() + ") has been adopted.");
			} else {
				System.out.println("You have failed at life");
			}
		} else {
			System.out.println("Inventory is empty - Cannot Adopt!");
		}
	}

}
