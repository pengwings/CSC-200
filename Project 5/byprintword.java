/**
 * Problem 2
 * Created by Brian Yu on 6/25/2017.
 */
import java.util.Scanner;

public class byprintword {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter in a word:");
        String word = keyboard.next();
        for(int i = 0; i<word.length(); i++){
            System.out.println(word.charAt(i));
        }
    }
}
