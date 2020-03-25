import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class MPGApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Miles Per Gallon calculator");
        System.out.println();  // print a blank line
        
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter miles driven: ");
            double miles = sc.nextDouble();
            
            System.out.print("Enter gallons of gas used: ");
            double gallons = sc.nextDouble();
            
            double mpg = miles/gallons;
            int mpgInt = (int)Math.round(mpg);
            double mpgRounded = (double)Math.round(mpg * 100)/100;
            System.out.println("Miles per gallon is " + mpg + ".");
            System.out.println("Miles per gallon rounded " + mpgInt + ".");
            System.out.println("Miles per gallon rounded " + mpgRounded + ".");
            
            //Now testing NumberFormat
            NumberFormat nf = NumberFormat.getInstance();
            nf.setMaximumFractionDigits(3);
            String mpgNf = nf.format(mpg);
            System.out.println("Miles per gallon NF " + mpgNf + ".");
            nf.setMaximumFractionDigits(2);
            String mpgNf2 = nf.format(mpg);
            System.out.println("Miles per gallon NF2 " + mpgNf2 + ".");
            
            //Testing Big Decimal
            BigDecimal mpgBd = new BigDecimal(miles/gallons);
            BigDecimal mpgBdRd = new BigDecimal(miles/gallons).setScale(2, RoundingMode.HALF_UP);
            System.out.println("Miles per gallon BigDecimal " + mpgBd + ".");
            System.out.println("Miles per gallon BigDecimal rounded " + mpgBdRd + ".");
            
            
            System.out.println(); 
            
            System.out.print("Calculate another MPG? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
    }
    
}
