
public class MathClassApp {

	public static void main(String[] args) {
		
		// do some rounding - whole # rounding
		long result = Math.round(1.667);
		// explicit cast to int because method returns a round
		int result1 = (int)Math.round(1.49);
		
		System.out.println("Result " + result);
		System.out.println("Result1 " + result1);

		// round a double to a specific number of decimal places
		double x = 10.315;
		// round to 2 decimal places
		double x1 = (double)Math.round(x*100)/100;
		// round to 1 decimal place
		double x2 = (double)Math.round(x*10)/10;
		
		System.out.println("x " + x);
		System.out.println("x1 " + x1);
		System.out.println("x2 " + x2);
	
		// generate some random #s
		double r1 = Math.random();
		System.out.println(r1);
		
		//dice roll - random between 1 and 6
		// Math.random() gives decimal number >= 0 and < 1
		int die1 = (int)(Math.random()*6)+1;
		System.out.println(die1);
		
		// min and max
		System.out.println(Math.max(7, 1));
		System.out.println(Math.min(3678,3422));
		
		System.out.println(Math.max(7.3333, 1.9999));
		System.out.println(Math.min(3678.11,3422.66));
		
	}

}
