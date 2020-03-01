package pl.edu.agh.hangman;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Hangman {

    public static final String[] HANGMANPICS = new String[]{
            "  +---+\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " /    |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " / \\  |\n" +
                    "      |\n" +
                    "========"
    };

    public static void main(String[] args) throws IOException {

    	System.out.println("lala");
    	NewGame gra1= new NewGame();
    	String word  = gra1.tryGame();
    	System.out.print(HANGMANPICS[4]);

    	Play gra = new Play(word);
    	
    	int maxNrOfTrials = 7;
    	int nrOfTrials = 0;
    	
		gra.emptyGuess();
    	while (nrOfTrials<maxNrOfTrials) {
    		gra.readLetter();
    		gra.tryLetter();
    		System.out.println(gra.getNrOfWrong());
    		System.out.println(gra.getCurrentGuess());
    		//System.out.println(gra.compare());
    		gra1.display(word, gra.getNrOfWrong());
    	}
    	

    }
}
