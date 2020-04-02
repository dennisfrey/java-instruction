import java.text.NumberFormat;

public class MonthSelectorApp {

    public static void main(String[] args) {
        System.out.println("Monthly Sales\n");
        
        // declare monthNames and monthSales arrays
        String[] monthName = new String [12];
        monthName[0] = "January";
        monthName[1] = "February";
        monthName[2] = "March";
        monthName[3] = "April";
        monthName[4] = "May";
        monthName[5] = "June";
        monthName[6] = "July";
        monthName[7] = "August";
        monthName[8] = "September";
        monthName[9] = "October";
        monthName[10] = "November";
        monthName[11] = "December";
        
        double[] monthSales = {1784.59, 2002.64, 1001.00, 3500.01, 6500.22, 7200.55, 
        						4321.12, 4545.32, 3355.33, 1122.22, 3214.14, 6666.66};
        
        
        		
        
        
        
        
        // get currency formatting
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // get one or more months
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get the input from the user
            int monthNumber = Console.getInt("Enter month number: ");
            
            // validate input
            if (monthNumber < 1 || monthNumber > monthName.length) {
                Console.displayLine("Invalid month number. Try again.");
                continue;                
            }
            
            // get the index number for the month
            // and display the month name and sales            
            System.out.println("Sales for " + monthName[monthNumber-1] + ": " + 
            					currency.format(monthSales[monthNumber-1]));

            // check if the user wants to continue
            choice = Console.getString("Continue? (y/n): ");
            Console.displayLine();
        }
        
        // display the total sales for the year
        double total = 0;
//        for(int i=0; i<monthName.length; i++) {
//        	
//        	total += monthSales[i];
//        	
//        }
        
        for(double sales: monthSales){
        	total += sales;
        }
        
        System.out.println("Total sales: " + currency.format(total));        
        Console.displayLine();
    }    

}
