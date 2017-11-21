/**
 * Created by Brian Yu on 7/16/2017.
 */
import java.util.Scanner;

public class bytheater {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[][] theater = new int[9][10];
        for(int i=0; i<10; i++) {
            for (int j = 0; j < 4; j++) {
                theater[j][i] = 10;
            }
            for(int k=4; k<7; k++) {
                theater[k][i] = 20;
            }
            for(int l=7; l<9; l++) {
                theater[l][i] = 30;
            }
        }

        for(int a=0; a<9; a++) {
            for(int b=0; b<10; b++) {
                System.out.printf("%4d",theater[a][b]);
            }
            System.out.print("\n");
        }

        System.out.println("Do you want to pick a seat or a price?");
        String choice = keyboard.next();
        switch(choice.toLowerCase()) {
            case "seat":
                System.out.println("Please choose a row (0-9).");
                int row = keyboard.nextInt();
                System.out.println("Please choose a column (0-10).");
                int column = keyboard.nextInt();
                if (theater[row][column] == 0) {
                    System.out.println("That seat is taken, please choose another.");
                    System.exit(0);
                } else {
                    theater[row][column] = 0;
                }
                break;
            case "price":
                System.out.println("Please enter a price (10 to 30).");
                int price = keyboard.nextInt();
                if(price == 10 || price ==20 || price ==30) {
                    priceloop:
                    for(int c=0; c<9; c++){
                        for(int d=0; d<10; d++){
                            if(price == theater[c][d]){
                                theater[c][d] = 0;
                                break priceloop;
                            }

                        }
                    }
                } else {
                    System.out.println("Please enter in a valid price.");
                    System.exit(0);
                }

        }
        for(int e=0; e<9; e++) {
            for (int f = 0; f < 10; f++) {
                System.out.printf("%4d", theater[e][f]);
            }
            System.out.print("\n");
        }

    }
}
