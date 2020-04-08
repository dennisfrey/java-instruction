package business;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountryIO {

	private Path countriesPath; // releative path - should end up in eclipse
	private File countriesFile;

	public CountryIO(){
		super();
		String path = "";
		this.countriesPath = Paths.get("countries.txt");
		this.countriesFile = countriesPath.toFile();

		if (Files.notExists(countriesPath)) {
			System.out.println("Create a file");
			try {
				Files.createFile(countriesPath);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public ArrayList<String> getCountries() {
		ArrayList<String> countries = new ArrayList<>();

		try {
			BufferedReader in = new BufferedReader(new FileReader(countriesFile));
			String line = in.readLine();
			while (line != null) {
				countries.add(line);
				line = in.readLine();
			}
		} catch (IOException e) {

			e.printStackTrace();
		}

		return countries;
	}

	public boolean saveCountries(ArrayList<String> countries) {
		try {
			PrintWriter out = new PrintWriter(
					  new BufferedWriter(
					  new FileWriter(countriesFile)));
			for(String country: countries) {
				out.println(country);
			}
			
			out.close();
			return true;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}
}
