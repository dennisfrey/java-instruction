import java.util.Scanner;

public class TableOfPowersApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Squares and Cubes table\n");
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			
			//Get user input
			System.out.print("Enter an integer: ");	
			int userInt = sc.nextInt();
			
			//print column headers
			System.out.println("\nNumber\tSquared\tCubed\n" +
								"======\t=======\t=====");
			
			//print calculations in row format
			for (int i=1;i<=userInt; i++) {
				System.out.print(i + "\t" + i*i + "\t" + i*i*i + "\n");
			}
			
			System.out.print("\nContinue? (y/n) ");
			choice = sc.next();
			System.out.println();
		}
		
		sc.close();
		System.out.println("Bye!");

	}

}
