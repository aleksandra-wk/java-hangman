package pl.edu.agh.hangman;

import java.util.Scanner;
import java.lang.*;

public class Play {
	
	private String wordToGuess;
	private int nrOfWrong = 0; ////////////////////////////////
	private char[] currentGuess;
	private char currentLetter;
	
	
	public Play(String wordToGuess) {
		super();
		this.wordToGuess = wordToGuess;
	}

	public int getNrOfWrong() {
		return nrOfWrong;
	}
	
	//split the word into chars
	private char[] splitToChars() {
		int length = wordToGuess.length();
		char[] letters=new char[length];
		for (int i = 0;i < wordToGuess.length(); i++){
		    letters[i]=wordToGuess.charAt(i);
		}
		return letters;
	}

	//create empty string of proper length
	void emptyGuess() {
		int length = wordToGuess.length();
		char[] guess= new char[length];
		for (int i=0;i<length;i++) {
			guess[i]='_';
		}
		currentGuess = guess;
	}
	
	//read letter from input
	void readLetter() {
		Scanner scanner = new Scanner(System.in);
        System.out.println("guess> ");
        char letter = scanner.next().charAt(0);
//        String sc = scan.nextLine();
        letter = Character.toUpperCase(letter);
		currentLetter = letter;
	}

	//try a letter and replace in a guess
	void tryLetter() {
		int trial = 0;
//		char a = currentLetter;
		for (int i=0;i<wordToGuess.length();i++) {
			if (splitToChars()[i]==currentLetter) {
				this.currentGuess[i]=currentLetter;
				trial = trial +1;
			}
		}
		if (trial==0) nrOfWrong=nrOfWrong+1;	
	}
	
	boolean compare() {
		for (int i=0;i<wordToGuess.length();i++) {
			if (splitToChars()[i]!=currentGuess[i]) {
				return false;
			}	
		}
		return true;
	}

	public char[] getCurrentGuess() {
		return currentGuess;
	}
	
}
