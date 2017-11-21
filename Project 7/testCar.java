/**
 * Created by Brian Yu on 7/9/2017.
 */
public class testCar {
    public static void main(String[] args){
        Car test = new Car(25);
        System.out.println(test.getGasLevel());
        test.addGas(20);
        System.out.println(test.getGasLevel());
        test.Drive(100);
        System.out.println(test.getGasLevel());
    }
}
