/**
 * Created by Brian Yu on 7/9/2017.
 */
public class Can {
    private double height, radius;

    public Can(double height, double radius){
        this.height = height;
        this.radius = radius;
    }

    public double getSurfaceArea(){
        return 2*Math.PI*(radius*radius)+height*(2*Math.PI*radius);
    }

    public double getVolume(){
        return Math.PI*(radius*radius)*height;
    }
}
