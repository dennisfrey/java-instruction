package ui;

import java.util.List;

import business.Stock;
import db.DAO;
import db.StockDB;
import util.Console;

public class WatchListApp {

	private static DAO<Stock> stockList = new StockDB();
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Finance App");
		
		String choice = "";
		displayMenu();
		
		while(!choice.equalsIgnoreCase("exit")) {
			
			choice = Console.getString("Command :", true);
			
			switch (choice) {
			case "list":
				listStocks();
				break;
			case "exit":
				break;
			default:
				System.out.println("Invalid Command!");
				break;
			}
			
		}
		
		
		
		
		System.out.println("Goodbye!");

	}

	private static void displayMenu() {
		System.out.println("Command Menu:");
		System.out.println("=================");
		System.out.println("list - list all stocks");
//		System.out.println("add - add a stock");
//		System.out.println("get - get a stock");
//		System.out.println("del - delete a stock");
		System.out.println("exit - exit the app");
		System.out.println();

	}
	
	private static void listStocks() {
		List<Stock> stocks = stockList.list();

		System.out.println("List of stocks....");
		for (Stock s : stocks) {
			System.out.println(s);
		}
	}
}
