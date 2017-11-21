/**
 * Problem 4
 * Created by Brian Yu on 6/11/2017.
 */
import java.util.Scanner;

public class bycity {
    public static void main(String[] args) {
        Scanner city = new Scanner(System.in);
        System.out.println("Enter the name of your favorite bycity:");
        String favorite = city.next();
        int count = favorite.length();
        String upper = favorite.toUpperCase();
        String lower = favorite.toLowerCase();
        char first = favorite.charAt(0);
        System.out.println("Your favorite bycity has " +count+ " characters in its name.");
        System.out.println("Your favorite bycity in all upper case letters is " +upper);
        System.out.println("Your favorite bycity in all lower case letters is " +lower);
        System.out.println("The first character of your favorite bycity is " +first);


    }
}
