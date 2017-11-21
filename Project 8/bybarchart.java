/**
 * Created by Brian Yu on 7/12/2017.
 */
import java.util.Scanner;

public class bybarchart {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter in value 1");
        int value1 = keyboard.nextInt();
        System.out.println("Please enter in a caption for value 1");
        String caption1 = keyboard.next();

        System.out.println("Please enter in value 2");
        int value2 = keyboard.nextInt();
        System.out.println("Please enter in a caption for value 2");
        String caption2 = keyboard.next();

        System.out.println("Please enter in value 3");
        int value3 = keyboard.nextInt();
        System.out.println("Please enter in a caption for value 3");
        String caption3 = keyboard.next();

        System.out.println("Please enter in value 4");
        int value4 = keyboard.nextInt();
        System.out.println("Please enter in a caption for value 4");
        String caption4 = keyboard.next();

        String bar1, bar2, bar3, bar4;
        bar1=bar2=bar3=bar4="";

        for(int a=0; a<value1; a++){
            bar1 = bar1 + "*";
        }
        for(int b=0; b<value2; b++){
            bar2 = bar2 + "*";
        }
        for(int c=0; c<value3; c++){
            bar3 = bar3 + "*";
        }
        for(int d=0; d<value4; d++){
            bar4 = bar4 + "*";
        }

        String[][] barchart = new String[2][4];
        barchart[0][0]= caption1;
        barchart[0][1]= caption2;
        barchart[0][2]= caption3;
        barchart[0][3]= caption4;
        barchart[1][0]= bar1;
        barchart[1][1]= bar2;
        barchart[1][2]= bar3;
        barchart[1][3]= bar4;

        for(int n=0; n<4; n++){
            for(int m=0; m<2; m++){
                System.out.print(barchart[m][n] + " ");
            }
            System.out.printf("%n");
        }

    }

}
