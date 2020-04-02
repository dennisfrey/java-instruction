
public class ContactListApp {

	public static void main(String[] args) {
		// welcome
		System.out.println("Welcome to the Contact LIst application");
		
		// get user input: first name, last name, email, phone
		String fn = Console.getString("Enter first name: ");
		String ln = Console.getString("Enter last name: ");
		String e = Console.getString("Enter email: ");
		String pn = Console.getString("Enter phone: ");
		
		// do business logic - create instance of contact
		Contact c = new Contact(fn, ln, e, pn);
		
		
		// display results
		System.out.println(c.displayContact());
		
		// goodbye
		System.out.println("Goodbye");
	}

}
