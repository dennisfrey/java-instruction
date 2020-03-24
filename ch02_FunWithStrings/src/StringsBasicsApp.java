import java.util.Scanner;

public class StringsBasicsApp {

	public static void main(String[] args) {
		String message = "Hello there";
		String emptyString = "";
		String nullString = null;
		String firstName = "Bob";
		String lastName = "Marley";
		String fullName = firstName + " " + lastName;
		
		String fullName2 = "";
		fullName2 += firstName;
		fullName2 += " ";
		fullName2 += lastName;
		System.out.println(fullName2);
		
		System.out.println("hello...\n\"George\t\tMcFly\"");
		
		//@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter something: ");
		String msg = sc.nextLine();
		System.out.println("You entered: " + msg);
		
		sc.close();

	}

}
