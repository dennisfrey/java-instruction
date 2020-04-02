package ui;

import java.util.Arrays;

import business.Product;

public class AdvancedArraysApp {

	public static void main(String[] args) {
		int[] numbers = {11,67,222,4,76};
		
		// order /sort, modify / add, search, copy
		
		// search
		int idx = Arrays.binarySearch(numbers,222);
		System.out.println("idx of 222 = "+ idx); //prints index of value
		
		System.out.println("All elements of the array:");
		for (int n:numbers) {
			System.out.println(n);
		}
		
		System.out.println("sort 'em!!!");
		Arrays.sort(numbers);

		System.out.println("All elements of the array:");
		for (int n:numbers) {
			System.out.println(n);
		}
	
		System.out.println("======let's sort some strings===========");
		String[] students = {"Marcus", "Jeff", "Tyler", "Sarah", "Sam", "Christian"};
		for(String s: students){
			System.out.println(s);
		}
		System.out.println("++++++Sort 'em");
		Arrays.sort(students);
		for(String s: students){
			System.out.println(s);
		}
		System.out.println("======Sort some products=======");
		Product p1 = new Product("java", "Murach's Java", 55.55);
		Product p2 = new Product("andr", "Murach's Android", 65.55);
		Product p3 = new Product("mysql", "Murach's MySQL", 39.99);
		Product p4 = new Product("html", "Murach's HTML", 45.99);
		
		Product[] products = {p1,p2,p3,p4};
		for (Product p: products) {
			System.out.println(p);
		}
		
		System.out.println("===- sort em=====");
		Arrays.sort(products);
		for (Product p: products) {
			System.out.println(p);
		}
	
		System.out.println("========== rectangular array =========");
		int[][] table = new int[3][2]; //3 rows, 2 columns
		table[0][0] = 1; // row 0, col 0
		table[0][1] = 2; // row 0, col 0
		table[1][0] = 3; // row 0, col 0
		table[1][1] = 4; // row 0, col 0
		table[2][0] = 5; // row 0, col 0
		table[2][1] = 6; // row 0, col 0
		
		// iterate through rows
		for (int i = 0; i < table.length; i++) {
			// iterate through the columns
			
			for (int j = 0; j < table[i].length; j++) {
				System.out.print(table[i][j] + " ");
			}
			//System.out.print("\n");
			System.out.println();
		}
		
	}

}
