
public class ValidateRequiredFieldApp {

	public static void main(String[] args) {
		// Get String - not required
		String s1 = Console.getString("Enter any string:  ");
		System.out.println("You entered:  "+s1);
		
		// Get String - required field
		String s2 = Console.getString("Enter any string (req'd):  ",true);
		System.out.println("You entered:  "+s2);
		
		// Get String - only 2 valid choices
		String s3 = Console.getString("Enter a string (y/n):  ","y","n");
		System.out.println("You entered:  "+s3);

	}

}
