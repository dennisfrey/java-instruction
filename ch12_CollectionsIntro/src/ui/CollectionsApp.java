package ui;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsApp {

	public static void main(String[] args) {
		System.out.println("Create an array of ints....");
		int[] numbersArray = new int[5];
		numbersArray[0] = 5;
		numbersArray[1] = 7;
		numbersArray[2] = 15;
		numbersArray[3] = 22;
		numbersArray[4] = 3;
		
		
		for (int number: numbersArray) {
			System.out.println(number);
		}
		
		ArrayList<Integer> numbersList = new ArrayList<>();
		numbersList.add(5);
		numbersList.add(7);
		numbersList.add(15);
		numbersList.add(22);
		numbersList.add(3);
		numbersList.add(0,1);
		
		for (int number: numbersList) {
			System.out.println(number);
		}
		System.out.println(numbersList);
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Sean");
		names.add("Trevor");
		names.add("marcus");
		names.add("Christian");
		
		System.out.println(names);
		System.out.println("What name is in position 2?:" + names.get(2));
		System.out.println("How big is the array list:" + names.size());
		System.out.println("Is Trevor in the list?: " + names.contains("Trevor")); // case sensitive
		System.out.println("Position of Christian: " + names.indexOf("Christian"));
		Collections.sort(names); //problem is that lower case will appear last in list
		System.out.println(names); 
		Collections.sort(names, String.CASE_INSENSITIVE_ORDER); // this will fix sorting of lowercase names
		System.out.println(names);
		
	}

}
