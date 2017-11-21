/**
 * Created by byu on 7/2/2017.
 */

public class Hangman {
    private String secret = "test";
    private char[] disguise = new char[secret.length()];
    private int correct;
    private int wrong;

    public char[] setupGame(){
        for(int n = 0; n<secret.length(); n++){
            disguise[n]='?';
        }
        return disguise;
    }

    public void MakeGuess(String guess) {
        if(secret.contains(guess)){
            correct++;
        }
        else{
            wrong++;
        }
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(0)) {
                disguise[i] = guess.charAt(0);
            }
        }

    }
    public char[] getDisguisedWord(){
        return disguise;
    }

    public String getSecretWord(){
        return secret;
    }

    public int getGuessCount(){
        return correct + wrong;
    }

    public boolean isFound(){
        String disguisecheck = new String(disguise);
        if(secret.equals(disguisecheck)){
            return true;
        }
        else {
            return false;
        }
    }
}
