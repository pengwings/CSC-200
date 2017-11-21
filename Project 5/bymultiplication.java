/**
 * Problem 4
 * Created by Brian Yu on 6/25/2017.
 */
public class bymultiplication {
    public static void main(String[] args){
        int multi = 0;
        for(int i = 0; i<10; i++){
            for(int x=1; x<11; x++) {
                multi = (i + 1) * (x);
                System.out.print(multi + " ");
            }
            System.out.println();
        }

    }
}
