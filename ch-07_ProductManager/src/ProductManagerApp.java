
public class ProductManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Product Mgr");
		
		// create some instances of products and display their info
		// create 2 instances of Product
		Product p1 = new Product(); // this will use default constructor because no parameters
		p1.setCode("java");
		p1.setDescription("Murachs's Java Programming");
		p1.setPrice(57.50);
		System.out.println(p1.toString());  //testing the toString() setup in the Product class
		System.out.println("Price of p1 is " + p1.getPriceFormatted());
		
		
		Product p2 = new Product("MySQL", "Murach's MySQL", 54.50); //testing constructor with passing in variables
		System.out.println(p2); //java will look for a toString method 
		
		Product p3 = new Product( "C#", "Murach's C#", 55.50);
		System.out.println(p3); //this now also prints a count of the number of objects
		
		System.out.println("Bye");
	}

}
