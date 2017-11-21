/**
 * Problem 3
 * Created by Brian Yu on 6/11/2017.
 */
import java.util.Scanner;

public class byhowfarcanwego {
    public static void main(String[] args){
        Scanner car = new Scanner(System.in);
        System.out.println("Please enter the number of gallons of gas in the tank:");
        int gallons = car.nextInt();
        System.out.println("Please enter the fuel efficiency in miles per gallon");
        int efficiency = car.nextInt();
        System.out.println("Please enter the price per gallon");
        double price = car.nextDouble();
        double cost = ((double) 100/efficiency)*price;
        int distance = gallons * efficiency;

        System.out.println("This car costs $" +(double)Math.round(cost*100)/100+ " to drive for 100 miles and can go " +distance+ " miles on a full tank of gas");

    }
}
