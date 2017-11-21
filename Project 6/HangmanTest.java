/**
 * Created by byu on 7/2/2017.
 */

import java.util.Scanner;

public class HangmanTest {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        Hangman game = new Hangman();
        game.setupGame();
        while(game.getGuessCount()<10){
            System.out.println("Guess a character in the secret word:");
            String guess = keyboard.next();
            game.MakeGuess(guess);
            System.out.println(game.getDisguisedWord());
            if(game.isFound() == true){
                System.out.println("Correct, the secret word is " + game.getSecretWord());
                System.exit(0);
            }
        }

    }
}
