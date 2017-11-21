/**
 * Problem 1
 * Created by Brian Yu on 6/18/2017.
 */
import java.util.Scanner;

public class byagecompare {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the age of person 1:");
        int p1 = keyboard.nextInt();
        System.out.println("Please enter the age of person 2:");
        int p2 = keyboard.nextInt();
        System.out.println("Please enter the age of person 3:");
        int p3 = keyboard.nextInt();

        if(p1>p2 && p1>p3){
            System.out.println("Person 1 is the oldest.");
        }
        else if(p2>p1 && p2>p3){
            System.out.println("Person 2 is the oldest.");
        }
        else if(p3>p1 && p3>p2){
            System.out.println("Person 3 is the oldest.");
        }
        if(p1<p2 && p1<p3){
            System.out.println("Person 1 is the youngest.");
        }
        else if(p2<p1 && p2<p3){
            System.out.println("Person 2 is the youngest.");
        }
        else if(p3<p1 && p3<p2){
            System.out.println("Person 3 is the youngest");
        }

        else{
            System.out.println("There are multiple people with the same age.");
        }
    }
}
