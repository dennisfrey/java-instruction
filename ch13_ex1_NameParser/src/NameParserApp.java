

import java.util.ArrayList;
import java.util.Scanner;

public class NameParserApp {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        String firstName = "";
        String middleName = "";
        String lastName = "";
        int numberOfParts = 0;
        
        for (int i=0; i < name.length(); i++) {
        	String character =  name.substring(i, i);
//        	if (character.equals(" ")){
//        		i++;
//        	} else {
//        		numberOfParts++;
//        		if (numberOfParts=1) {
//        			
//        		} else (if numberOfParts=2){
//        			
//        		} else (if numberOfParts=3){
//        			
//        		} else {
//        			System.out.println("Invalid number of parts!");
//        		}
//        	}
//        		
//        }
//        
        
        int index = 0;
        int index2 = 0;
        int index3 = 0;

        String[] nameParts = name.split(" ");
        System.out.println(nameParts.length);
        
        index = name.indexOf(" ");
        firstName = name.substring(0, index);

        index2 = name.indexOf(" ", index + 1);
        lastName = name.substring(index + 1, name.length());
        
        System.out.println("first name " + firstName);
        System.out.println("Last name " + lastName);
    }
}
