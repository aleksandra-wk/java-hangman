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
	
	ArrayList<String> words = new ArrayList<String>();
	
	public NewGame() {
		
	}



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
	
	
	public String randomWord(ArrayList<String> words) {
		
		
		Random random = new Random();
		int randIndex = random.nextInt(words.size());
		
		return words.get(randIndex);
	}
	

}