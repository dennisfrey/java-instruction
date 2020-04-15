package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import business.Contact;

public class ContactManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Contact Manager App!");
		
		List<Contact> contacts = new ArrayList<>();
		
		contacts.add(new Contact("Mike Murach", null, "800-221-5528"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));
		
		/// print list of all contacts
		System.out.println("All contacts:");
		displayContacts(contacts);

		System.out.println("Contacts no phone");
		List<Contact> contactsNoPhone = filterContacts(contacts,
										c -> c.getPhone()==null); //passing lambda expression to method
		
		displayContacts(contactsNoPhone);
				
		System.out.println("Contacts no email");
		List<Contact> contactsNoEmail = filterContacts(contacts,
										c -> c.getEmail()==null); //passing lambda expression to method
		displayContacts(contactsNoEmail);
		
		System.out.println("Contacts no email nor phone");
		List<Contact> contactsNoEmailNoPhone = filterContacts(contacts,
										c -> c.getEmail()==null && c.getPhone()==null); //passing 2 lambda expressions to method
		displayContacts(contactsNoEmailNoPhone);
		
		// Who has last name Murach?
		System.out.println("Contacts w/ last name of Murach");
		List<Contact> contactsMurach = filterContacts(contacts,
										c -> c.getName().contains("Murach")); //passing lambda expressions to method using lamda Predicate
		displayContacts(contactsMurach);
		
		System.out.println("Process contact list - print out the names");
		processContacts(contacts, c-> System.out.println(c.getName())); //passing lamda to print out using lambda Consumer
		
		//Code that changes the name, manipulating the original list contacts
//		System.out.println("Process contact list - convert each name to uppercase");
//		processContacts(contacts, c-> c.setName(c.getName().toUpperCase()));
//		displayContacts(contacts);
		
		System.out.println("Transform contact list to list of Strings (name:phone)");
		List<String> contactPhoneNumbers = transformContacts(contacts, c->{ String phone = (c.getPhone()==null) ? "n/a": c.getPhone(); //lamda Function using ternary operator
			return c.getName() + ": " + phone;
		}); 
		
		for (String s: contactPhoneNumbers) {
			System.out.println(s);
		}
	}

	private static List<Contact> filterContacts(List<Contact> contacts, Predicate<Contact> condition){
		
		List<Contact> filteredContacts = new ArrayList<>();
		for (Contact c: contacts) {
			//passing the lambda condition into the method and takes place of condition.test
			if (condition.test(c)) {
				filteredContacts.add(c);
			}
		}
		
		return filteredContacts;
	}
	
	private static void displayContacts(List<Contact> contacts) {
		System.out.println("All contacts:");
		
		for (Contact c: contacts) {
			System.out.println(c);
		}
	}
	
	private static void processContacts(List<Contact> contacts, Consumer<Contact> consumer) {
		
		for (Contact c: contacts) {
			consumer.accept(c);
			
		}
		
	}
	
	private static List<String> transformContacts(List<Contact> contacts, Function<Contact, String> function){
	
		List<String> strings = new ArrayList<>();
		
		for(Contact c: contacts) {
			strings.add(function.apply(c));
		}
		
		return strings;
		
	}
	
}
