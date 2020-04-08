package ui;

import java.util.List;

import business.Movie;
import db.DAO;
import db.MovieList;
import db.MovieTextFile;
import util.Console;

public class BmdbConsoleApp {
	
	//private static DAO<Movie> movieRepo = new MovieList();// Initialize database we created
	private static DAO<Movie> movieRepo = new MovieTextFile(); //pointing to file instead of database
	
	public static void main(String[] args) {
		// Welcome and initialization
		System.out.println("Welcome to the BMDB Console App!!!");
		String command = "";		

		while (!command.equalsIgnoreCase("exit")) {
			displayMenu();

			// Get User Input
			command = Console.getString("Command?: ", true);

			// Business Logic

			// Display to screen
			switch (command) {
			case "get":
				getMovie();
				break;
			case "list":
				listMovies();
				break;
			case "add":
				addMovie();
				break;
			case "del":
				deleteMovie();
				break;
			case "exit":
				// exit the app, do nothing
				break;
			default:
				System.out.println("Invalid Entry. Try again.");
				break;

			}

		}
		// Bye
		System.out.println("Bye");

	}

	private static void deleteMovie() {
		// prompt user for id and get the movie
		Movie m = getIdAndReturnMovie();
		
		// delete the movie
		movieRepo.delete(m);
		
		// display confirmation message
		System.out.println("Movie successfully deleted!");
		System.out.println();
		
	}

	private static void addMovie() {
		// prompt user for movie data
		//int id = Console.getInt("Movie ID: ", 0, (int)Double.POSITIVE_INFINITY);
		String title = Console.getString("Movie Title: ", true);
		int year = Console.getInt("Release Year: ", 0, (int)Double.POSITIVE_INFINITY);
		String rating = Console.getString("Movie Rating: ", true);
		String director = Console.getString("Movie Director: ", true);
		
		// add the movie
		Movie m = new Movie(0, title, year, rating, director);
		movieRepo.add(m);
		
		// display confirmation message
		System.out.println("Movie successfully added!");
		
	}

	private static void listMovies() {
		// get list of all movies
		List<Movie> movies = movieRepo.list();
		
		// display to screen
		for (Movie m: movies) {
			System.out.println(m);
		}
		
	}

	private static void getMovie() {
		// prompt user for id and get the movie
		Movie m = getIdAndReturnMovie();
		
		// display to screen
		System.out.println(m);
		
	}

	private static void displayMenu() {
		StringBuilder menu = new StringBuilder("COMMAND MENU\n");
		menu.append("list   - List all movies\n");
		menu.append("get    - Get a movie by id\n");
		menu.append("add    - Add a movie\n");
		menu.append("del    - Delete a movie\n");
		menu.append("exit   - Exit the Program\n");
		System.out.println(menu);
	}

	private static Movie getIdAndReturnMovie() {
		Movie m = null;
		
		// loop will continue until user inputs correct id
		while (m==null) {
			int id = Console.getInt("Movie ID: ", 0, (int)Double.POSITIVE_INFINITY);
			m = movieRepo.get(id);
			System.out.println();
		}
		
		return m;
	}
	
}
