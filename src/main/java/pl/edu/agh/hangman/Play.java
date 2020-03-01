package pl.edu.agh.hangman;

import java.util.Scanner;

public class Play {
	
	private String wordToGuess;
	private int length = wordToGuess.length();
	private int maxNrOfTrials = 7;
	private int nrOfWrong = 0; ////////////////////////////////
	private char[] currentGuess;
	private char currentLetter;
	
//	char currentChar = null;
	
//	char[] letters = splitToChars(wordToGuess);
//	
//	for(char s : letters) {
//		System.out.println(s);
//	}
	
	
	/// aaaaa! potrzebuje tez konstruktora!
	
	
	//split the word into chars
	private char[] splitToChars() {
		char[] letters=null;
		for (int i = 0;i < wordToGuess.length(); i++){
		    letters[i]=wordToGuess.charAt(i);
		}
		return letters;
	}
	
	//create empty string of proper length
	private char[] emptyGuess(int length) {
		char[] guess = null;
		for (int i=0;i<length;i++) {
			guess[i]='_';
		}
		return guess;
	}
	
	//read letter from input
	private char readLetter() {
		Scanner scanner = new Scanner(System.in);
        System.out.println("guess> ");
        char letter = scanner.next().charAt(0);
//        String sc = scan.nextLine();
		return letter;
	}

	//try a letter and replace in a guess
	private void tryLetter(char a) {
		for (int i=0;i<length;i++) {
			if (splitToChars()[i]==currentLetter) {
				this.currentGuess[i]=currentLetter;
			}
		}
	
		
	}
	
}
