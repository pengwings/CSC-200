/**
 * Problem 1
 * Created by Brian Yu on 6/11/2017.
 */
import java.util.Scanner;

public class byconvert {
    public static void main(String[] args)
    {
        System.out.println("Please enter the number of meters:");
        Scanner meter = new Scanner(System.in);
        int m = meter.nextInt();
        double miles = (m/1609.34);
        double feet = ((m%1609.34)*3.28084);
        double inches = (feet%1)*12;
        System.out.println(m + " meters is roughly:");
        System.out.println("Miles: " + (int)miles);
        System.out.println("Feet: "+ (int)feet);
        System.out.println("Inches: " + (int)inches);
    }
}
