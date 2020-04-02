package ui;

import java.text.NumberFormat;

import util.Console;

public class BattingStatisticsApp {

	public static void main(String[] args) {

		String choice = "y";
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(3);
		nf.setMinimumFractionDigits(3);

		System.out.println("Welcome to the Batting Average Calculator");

		while (choice.equalsIgnoreCase("y")) {

			// Prompt for number of at bats
			int atBats = Console.getInt("\nEnter number of times at bat: ", 0, 31);

			System.out.println("\n0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run\n");

			int[] stats = new int[atBats];
			double sumHits = 0;
			double sumBases = 0;

			// Collect the stats for each at bat
			for (int i = 0; i < stats.length; i++) {

				stats[i] = Console.getInt("Result for at-bat " + (i + 1) + ": ", -1, 5);
				sumBases += stats[i];
				if (stats[i] > 0) {
					sumHits++;
				}

			}

			// Calculate Batting Average and Slugging Percentage
			double battingAvg = sumHits / atBats;
			double sluggingPerc = sumBases / atBats;

			System.out.println("\nBatting average: " + nf.format(battingAvg));
			System.out.println("Slugging percent: " + nf.format(sluggingPerc));

			choice = Console.getString("\nAnother player? (y/n): ", "y", "n");
		}

		System.out.println("\nBye!");
	}

}
