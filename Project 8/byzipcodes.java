/**
 * Created by Brian Yu on 7/16/2017.
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
        String[][] zipcodes = new String[number+1][3];
        Scanner input = new Scanner(System.in).useDelimiter("\\s");
        zipcodes[0][0] = "First Name";
        zipcodes[0][1] = "Last Name";
        zipcodes[0][2] = "Zip Code";

        for(int i=1; i<number+1; i++){
            System.out.println("Please enter in the first name, last name, and zip code separated by spaces.");
            zipcodes[i][0] = input.next();
            zipcodes[i][1] = input.next();
            zipcodes[i][2] = input.next();
        }

        for(int j=0; j<number+1; j++){
            for(int k=0; k<3; k++){
                System.out.printf("%-12s",zipcodes[j][k]);
            }
            System.out.print("\n");
        }

    }
}