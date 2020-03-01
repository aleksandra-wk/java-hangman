package pl.edu.agh.hangman;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;

public class NewGame {

	Path file = Paths.get("slowa.txt");
	
	
	
	public NewGame() {
		
	}
	public String tryGame() {
		ArrayList<String> words = loadFile(file);
		String word = randomWord(words).toUpperCase();
		return word;
	}
	

	public ArrayList<String> loadFile(Path file) {
		ArrayList<String> words = new ArrayList<String>();
		try (BufferedReader reader = Files.newBufferedReader(file)) {
		    String line = null;
		    while ((line = reader.readLine()) != null) {
		    	words.add(line);
		    }
		} catch (IOException x) {
		    System.err.format("IOException: %s", x);
		}
		return words;
	}
	
	
	public String randomWord(ArrayList<String> words) {
		Random random = new Random();
		int randIndex = random.nextInt(words.size());
		return words.get(randIndex);
	}
	

}