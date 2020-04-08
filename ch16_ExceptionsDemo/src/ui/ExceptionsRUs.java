package ui;

import java.util.InputMismatchException;

import util.ConsoleUtil;

public class ExceptionsRUs {

	public static void main(String[] args) {
		System.out.println("hi");
		
		try {
			double d = ConsoleUtil.getDouble("Enter a yearly interest rate: ");
		} catch (InputMismatchException ime) {
			
			ime.printStackTrace();
		}
		
		
		System.out.println("bye");

	}

}
