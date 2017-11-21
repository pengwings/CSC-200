/**
 * Created by byu on 7/3/2017.
 */

public class Movie {
    private String name;
    private String rating;
    private int r1, r2, r3, r4, r5;

    public Movie(String name, String rating, int r1, int r2, int r3, int r4, int r5){
        this.name = name;
        this.rating = rating;
        this.r1 = r1;
        this.r2 = r2;
        this.r3 = r3;
        this.r4 = r4;
        this.r5 = r5;
    }

    public void addRating(int rate){
        if(rate>0 && rate<6){
            switch(rate){
                case 1:
                r1++;
                break;
                case 2:
                r2++;
                break;
                case 3:
                r3++;
                break;
                case 4:
                r4++;
                break;
                case 5:
                r5++;
                break;
            }
        } else{
            System.out.println("Please enter in a valid rating.");
        }
    }

    public double getAverage(){
        return ((r1)+(r2*2)+(r3*3)+(r4*4)+(r5*5))/(double)(r1+r2+r3+r4+r5);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getR1() {
        return r1;
    }

    public void setR1(int r1) {
        this.r1 = r1;
    }

    public int getR2() {
        return r2;
    }

    public void setR2(int r2) {
        this.r2 = r2;
    }

    public int getR3() {
        return r3;
    }

    public void setR3(int r3) {
        this.r3 = r3;
    }

    public int getR4() {
        return r4;
    }

    public void setR4(int r4) {
        this.r4 = r4;
    }

    public int getR5() {
        return r5;
    }

    public void setR5(int r5) {
        this.r5 = r5;
    }
}
