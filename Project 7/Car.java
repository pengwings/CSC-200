/**
 * Created by Brian Yu on 7/9/2017.
 */
public class Car {
    private double efficiency, fuel;

    public Car(double mpg){
        this.efficiency = mpg;
        this.fuel = 0;
    }

    public void addGas(double gas){
        fuel = gas;
    }

    public double getGasLevel(){
        return fuel;
    }

    public void Drive(double distance){
        fuel = fuel - (distance/efficiency);
    }
}
