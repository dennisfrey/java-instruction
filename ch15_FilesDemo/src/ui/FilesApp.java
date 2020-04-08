package ui;

import java.io.File;
import java.io.IOException;
import java.io.*;
//import java.nio.file.DirectoryStream;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
import java.nio.file.*;

public class FilesApp {

	public static void main(String[] args) throws IOException {
		// p463 create directory and file
		String dirString = "C:/temp";
		Path dirPath = Paths.get(dirString);
		if (Files.notExists(dirPath)) {
			Files.createDirectories(dirPath); // create folder on hard drive
			System.out.println("Directory created");
		} else {
			System.out.println("directory " + dirString + " already exists");
		}

		// create file
		String fileString = "products.txt";
		Path filePath = Paths.get(dirString, fileString);
		if (Files.notExists(filePath)) {
			System.out.println("Create a file");
			Files.createFile(filePath);
		} else {
			System.out.println("File already exists.");
		}

		System.out.println("File name:     " + filePath.getFileName());
		System.out.println("Absolute Path: " + filePath.toAbsolutePath());
		System.out.println("Is writable:     " + Files.isWritable(filePath));

		// Display files in a directory
		// if directory and file exist
		if (Files.exists(dirPath) && Files.isDirectory(dirPath)) {
			System.out.println("Directory " + dirPath.toAbsolutePath());
			System.out.println("Files:");
			DirectoryStream<Path> dirStream = Files.newDirectoryStream(dirPath);
			for (Path p : dirStream) {
				if (Files.isRegularFile(p)) {
					System.out.println("        " + p.getFileName());
				}
			}
		}

		// p467 write and read data
		// open an output stream
		Path productsPath = Paths.get("products.txt"); // releative path - should end up in eclipse
		File productsFile = productsPath.toFile();

		PrintWriter out = new PrintWriter(
						  new BufferedWriter(
						  new FileWriter(productsFile)));
		
		//write data to the file
		out.println("java\tMurach's Java programming\t57.50");
		
		// close the output stream and free system resource
		out.close();
		
		// Read data from a file
		// open an input stream
		BufferedReader in = new BufferedReader(
							new FileReader(productsFile));
		
		System.out.println("read data from the file");
		// read data from the stream and print it to the console
		String line = in.readLine();
		System.out.println(line);
		
		//close stream
		in.close();
			
		
		
	}

}
