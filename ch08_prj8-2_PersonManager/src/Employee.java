
public class Employee extends Person{

	private String ssn;

	public Employee() {
		super();
	}

	public Employee(String firstName, String lastName, String ssn) {
		super(firstName, lastName);
		this.ssn = ssn;
	}

	public String getSsn() {
		return "xxx-xx-" + ssn.substring(7);
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return super.toString() + "\nSSN: " + getSsn();
	}
	
	
}
