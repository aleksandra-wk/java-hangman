package pl.edu.agh.hangman;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class NewGame {

	Path file = Paths.get("slowa.txt");

	private ArrayList<String> words = new ArrayList<String>();
	
	
	public void loadFile(Path file) {
		try (BufferedReader reader = Files.newBufferedReader(file)) {
		    String line = null;
		    while ((line = reader.readLine()) != null) {
		    	words.add(line);
		    }
		} catch (IOException x) {
		    System.err.format("IOException: %s", x);
		}
	}
	
	
	
	//public void findWord() {
		

}