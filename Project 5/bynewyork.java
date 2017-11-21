/**
 * Problem 5
 * Created by Brian Yu on 6/25/2017.
 */
public class bynewyork {
    public static void main(String[] args){
        int x = 0;
        int y = 0;
        for(int i = 0; i<100; i++){
            int random = (int)(4.0*Math.random());
            switch(random){
                case 1: random = 0;
                        x = x+1;
                        break;
                case 2: random = 1;
                        x = x-1;
                        break;
                case 3: random = 2;
                        y = y+1;
                        break;
                case 4: random = 3;
                        y = y-1;
                        break;
            }
        }
        System.out.println("You are at coordinates (" + x + "," + y + ")");
    }
}
