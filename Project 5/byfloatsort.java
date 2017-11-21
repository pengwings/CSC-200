/**
 * Problem 1
 * Created by Brian Yu on 6/25/2017.
 */
import java.util.Scanner;
import java.util.ArrayList;

public class byfloatsort {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a set of floating-point values:");
        ArrayList<Float> floatingpoints = new ArrayList<Float>();
        Float f;
        do{
            try{
                String input = keyboard.next();
                f = Float.parseFloat(input);
                floatingpoints.add(f);
            } catch (NumberFormatException e){
                break;
            }
        }while (f instanceof Float);
        Float arraysum=0f;
        Float arraymax=Float.MIN_VALUE;
        Float arraymin=Float.MAX_VALUE;
        for(int i = 0; i<floatingpoints.size(); i++) {
            arraysum += floatingpoints.get(i);
            if (floatingpoints.get(i) > arraymax) {
                arraymax = floatingpoints.get(i);
            }
            if (floatingpoints.get(i) < arraymin) {
                arraymin = floatingpoints.get(i);
            }
        }
        System.out.println("The average of the floating point values you entered is: " + (arraysum/floatingpoints.size()));
        System.out.println("The smallest floating point value you entered is: " + arraymin);
        System.out.println("The largest floating point value you entered is: " + arraymax);
        System.out.println("The range of the floating point values you entered is: " + (arraymax-arraymin));

    }
}
