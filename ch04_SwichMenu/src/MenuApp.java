import java.util.Scanner;

public class MenuApp {

	public static void main(String[] args) {
	
		System.out.println("Hello and Welcome");
		Scanner sc = new Scanner(System.in);
		
		
	//demonstrate the use of a switch statement in a menu
		String choice = "";
		while (!choice.equalsIgnoreCase("x")) {
			// display menu
			String menu = "Menu\n" +
						  "============\n" +
						  "L - list all users\n" +
						  "C - create a user\n" +
						  "U - update a user\n" +
						  "D - delete a user\n" +
						  "G - get a user\n"  +
						  "X - exit\n";
						  
			
			System.out.println(menu);
			
			
			// get the user input
			choice = sc.next();
			
			// do something based on that choice
			switch(choice) {
				case "l": //this is tho handle the upper and lower case
				case "L":
					System.out.println("Listing all users");
					break; //must include break or it will complete the c case (without validating c)
				case "c":
				case "C":
					System.out.println("Creating a user");
					break;
				case "u":
				case "U":
					System.out.println("Updating a user");
					break;
				case "d":
				case "D":
					System.out.println("Deleting a user");
					break;
				case "g":
				case "G":
					System.out.println("Get a user");
					break;
				case "x":
				case "X":
					break;
				//default is if we do not satisfy any of the other conditions
				default:
					System.out.println("Invalid choice, try again.");
					break;

				
			}
		}
		System.out.println("Goodbye");
	}

}
