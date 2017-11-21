/**
 * Created by byu on 7/3/2017.
 */
public class Die {
    int numFaces;
    int faceValue;

    public Die(int faces){
        numFaces = faces;
        faceValue = 1;
    }

    public int roll(){
        faceValue = (int)(Math.random()* numFaces) + 1;
        return faceValue;
    }
}
