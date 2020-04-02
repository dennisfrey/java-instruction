
public class PersonManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Person Manager");

		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {

			String type = Console.getString("\nCreate customer or employee? (c/e): ");
			Person p; //added this based on Sean's instructions. Also added the related p.toSting()
			if (type.equalsIgnoreCase("c") || type.equalsIgnoreCase("e")) {
				if (type.equalsIgnoreCase("c")) {
					Customer c = new Customer();
					c.setFirstName(Console.getString("\nFirst name: "));
					c.setLastName(Console.getString("Last name: "));
					c.setCustomerNumber(Console.getString("Customer Number: "));
					//System.out.println("\nYou entered a new Customer: \n" + c.toString());
					p = c;
				} else {
					Employee e = new Employee();
					e.setFirstName(Console.getString("\nFirst name: "));
					e.setLastName(Console.getString("Last name: "));
					e.setSsn(Console.getString("SSN: "));
					//System.out.println("\nYou entered a new Employee: \n" + e.toString());
					p = e;
				}
				System.out.println("\nYou entered a new "+ p.getClass().getName());
				System.out.println(p.toString());
			} else {
				System.out.println("Error! Entry must be 'c' or 'e'. Try again.");
				continue;
			}

			while (true) {

				choice = Console.getString("\nContinue? (y/n): ");
				if (!choice.equalsIgnoreCase("y") && !choice.equalsIgnoreCase("n")) {
					System.out.println("Error! Entry must be 'y' or 'n'. Try again. ");
				} else {
					break;
				}

			}
		}

		System.out.println("Goodbye!");

	}

}
