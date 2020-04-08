package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleUtil {

	private static Scanner sc = new Scanner(System.in);

	public static double getDouble(String prompt) {
		double d = 0.0;

		try {
			System.out.println(prompt);
			d = sc.nextDouble();
		} catch (InputMismatchException ime) {

			ime.printStackTrace();
			throw ime;
		} catch (Exception e) {

			e.printStackTrace();

			
		}
		return d;
	}
}
