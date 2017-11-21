/**
 * Problem 5
 * Created by Brian Yu on 6/11/2017.
 */
import java.util.Scanner;

public class byshift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = input.next();
        String right = word.substring(word.length()-2);
        String left = "";
        for(int i=0; i<word.length()-2; i++){
            right = right + word.charAt(i);
        }
        for(int n=0; n<word.length()-2; n++){
            left = left + word.charAt(n+2);
        }
        System.out.println("Your word is: "+ word);
        System.out.println("Your word shifted two letters to the right is: " + right);
        System.out.println("Your word byshift two letters to the left is: " + left+word.substring(0,2));
    }
}
