package pl.edu.agh.hangman;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

public class NewGame {

	File file = new File("src/main/resources/slowa.txt");
	//Path file = Paths.get("slowa.txt");
	
	private char[] checkWord;
	private ArrayList<String> words = new ArrayList<String>();
	private int option = 0;
	
	public NewGame() {
		
	}
	public String tryGame() {
		System.out.println("Wybierz metode wybory slowa:");
		System.out.println("[0] Losuj z pliku");
		String word = null;
		Scanner scanner  = new Scanner(System.in);
		option = scanner.nextInt();
		if (option != 0)
		{
			System.out.println("Opcja nie dostepna");
		}
		else {
			word = wordFromFile();
		}
		
		
		return word;
	}
	
	private String wordFromFile() {
		ArrayList<String> words = loadFile(file);
		String word = randomWord(words).toUpperCase();
		System.out.println(word);
		return word;
	}
	public void display(String word, int errors) {
		wordDisplay(word);
		errors =-1;
		System.out.println();
		//String[] hangmanNo = ;
		if (errors < 0) {
			System.out.println(" ");
		}
		else {
		System.out.println(Hangman.HANGMANPICS[errors]);
		}
	}
	
	private void wordDisplay(String word) {
		char[] checkWord = new char[word.length()];
		for (int i = 0; i < word.length(); i++) {
			
			if (word.charAt(i) == ' ') {
				checkWord[i] = ' ';
			}
			else {		
			checkWord[i] = '_';
			}
		}
		System.out.println(checkWord);
	}
	
	//load file into array
	private ArrayList<String> loadFile(File file) {
		ArrayList<String> words = new ArrayList<String>();
		try (BufferedReader reader = Files.newBufferedReader(file.toPath())) {
		    String line = null;
		    while ((line = reader.readLine()) != null) {
		    	words.add(line);
		    }
		} catch (IOException x) {
		    System.err.format("IOException: %s", x);
		}
		return words;
	}
	
	//random word
	private String randomWord(ArrayList<String> words) {
		Random random = new Random();
		int randIndex = random.nextInt(words.size());
		return words.get(randIndex);
	}
	

}