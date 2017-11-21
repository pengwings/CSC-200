/**
 * Created by Brian Yu on 7/9/2017.
 */
public class testCan {
    public static void main(String[] args){
        double surfacearea, volume;
        Can test = new Can(5.0, 2.5);
        surfacearea = test.getSurfaceArea();
        volume = test.getVolume();
        System.out.println("The surface area is " + surfacearea + " and the volume is " + volume);
    }
}
