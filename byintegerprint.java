/**
 * Problem 2
 * Created by Brian Yu on 6/11/2017.
 */
import java.util.Scanner;

public class byintegerprint {
    public static void main(String[] args){
        System.out.println("Please enter positive integer with max of 5 digits:");
        Scanner digits = new Scanner(System.in);
        int x = digits.nextInt();
        String integerstring = Integer.toString(x);
        for(int n=0; n<integerstring.length(); n++){
            System.out.println(integerstring.charAt(n));
        }
    }

}
