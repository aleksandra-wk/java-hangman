package pl.edu.agh.hangman;

public class Play {
	
	private String wordToGuess = "dupa";
	private int length = wordToGuess.length();
	private int nrOfTrials = 7;
	private char[] emptyGuess = null;
	
//	char currentChar = null;
	
//	char[] letters = splitToChars(wordToGuess);
//	
//	for(char s : letters) {
//		System.out.println(s);
//	}
	
	
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
		return guess;
	}
	
	//read letter from input
	private char readLetter() {
		char letter = ' ';
		return letter;
	}

	//try a letter and replace in a guess
	private void tryLetter(char a) {
		
	}
	
}
