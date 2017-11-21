/**
 * Problem 3
 * Created by Brian Yu on 6/25/2017.
 */
import java.util.Scanner;

public class byfibonnaci {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an integer for the nth term of the Fibonacci number:");
        int term = keyboard.nextInt();
        int fterm = fibonacci(term);
        System.out.println("The " + term + "th term of the Fibonacci sequence is " + fterm);
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

