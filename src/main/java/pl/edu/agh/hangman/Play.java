package pl.edu.agh.hangman;

import java.util.Scanner;

public class Play {
	
	private String wordToGuess = "dupa";
	private int length = wordToGuess.length();
	private int nrOfTrials = 7;
	private char[] emptyGuess = null;
	private char currentLetter = ' ';
	
//	char currentChar = null;
	
//	char[] letters = splitToChars(wordToGuess);
//	
//	for(char s : letters) {
//		System.out.println(s);
//	}
	
	
	/// aaaaa! potrzebuje tez konstruktora!
	
	
	//split the word into chars
	private char[] splitToChars(String word) {
		char[] letters=null;
		for (int i = 0;i < word.length(); i++){
		    letters[i]=word.charAt(i);
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
		
		
	}
	
}
