
public class ForLoopApp {

	public static void main(String[] args) {
		System.out.println("Hello For Loops!");
		
		// once a month we'll pay rent
		
		System.out.println("Pay rent once a month");
		for (int i=1; i <= 12; i++) {
			// do this once per month
			System.out.println("Rent paid for month " + i);
		}
		
		System.out.println("Score some hoops! 2 pointers");
		
		for (int i = 0; i <= 20; i+=2) {
			System.out.println("Points = " + i);
		
		}
		
		System.out.println("It's Monday booo...countdown to Friday!");
		
		for (int i = 4; i >= 1; i--) {
			System.out.println(i + " days left...booo!");
		}
		System.out.println("Yeah Friday");
		
		
		int orders = 30;
		System.out.println("Let's process some orders... "+orders+ " orders");
		for (int i=0; i < orders; i++) {
			System.out.println("Order processed: id = "+i);
		}
		System.out.println("All orders processed");
		
		System.out.println("Bye");

	}

}
