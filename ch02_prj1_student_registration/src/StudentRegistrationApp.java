import java.util.Scanner;

public class StudentRegistrationApp {

	public static void main(String[] args) {
		
		
		System.out.println("Student Registration Form");
		Scanner sc = new Scanner(System.in);
		
		//Get user input
		System.out.print("Enter first name: ");
		String firstName = sc.nextLine();
		System.out.print("Enter last name: ");
		String lastName = sc.nextLine();
		System.out.print("Enter year of birth: ");
		int yearOfBirth = sc.nextInt();
	
		String tempPwd = firstName + "*" + yearOfBirth;
		//parse out blank spaces in the case of 2 first names
		tempPwd = tempPwd.replaceAll("\\s", "");
		System.out.println("Welcome " + firstName + " " + lastName);
		System.out.println("Your registration is complete");
		System.out.println("Your temporary password is: " + firstName + "*" + yearOfBirth);
		System.out.println("*Parsed* Your temporary password is: " + tempPwd);
		
		sc.close();
		System.out.println("Goodbye!");	
	}

}
