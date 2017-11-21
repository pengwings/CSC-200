/**
 * Created by byu on 7/12/2017.
 */
import java.util.Scanner;

public class byzipcodes {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the number of pairs of names and zip codes (up to 25). ");
        int number = keyboard.nextInt();
        while(number<0 || number>25) {
            System.out.println("Please enter a valid number.");
            number = keyboard.nextInt();
        }
        String[][] zipcodes = new String[3][number+1];
        zipcodes[0][0] = "First Name";
        zipcodes[0][1] = "Last Name";
        zipcodes[0][2] = "Zip Code";

        for(int)


    }
}
