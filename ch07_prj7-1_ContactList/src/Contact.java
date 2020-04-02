
public class Contact {
	// 1) define instance variables
	private String firstName;
	private String lastName;
	private String email;
	private String phone;

	
	// 2) generate constructors: always 2 - default and fully loaded
	
	public Contact() {
		super();
	}


	public Contact(String firstName, String lastName, String email, String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}

	
	// 3) generate getters/setters

	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	// define displayContact method (requirement in prj 7-1)
	
	public String displayContact() {
		String contactStr = "----------------------------------\n" +
							"---- Current Contact -------------\n" +
							"----------------------------------\n" +
							"Name:         "+firstName+" "+lastName+"\n" +
							"Email Adress: "+email+"\n" +
							"Phone Number: "+phone+"\n" +
							"----------------------------------\n";
		
		return contactStr;
		
	}
	
	
}
