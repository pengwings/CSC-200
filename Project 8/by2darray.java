/**
 * Created by Umaru on 7/16/2017.
 */
public class by2darray {
    public static void main(String[] args) {
        int[][] test = new int[5][5];
        for(int i=0; i<test.length; i++) {
            for(int j=0; j<test[0].length; j++) {
                test[i][j] = (int)(Math.random()*100);
            }
        }
        for(int i=0; i<test.length; i++) {
            for(int j=0; j<test[0].length; j++) {
                System.out.printf("%4d", test[i][j]);
            }
            System.out.println();
        }
        int total = getTotal(test);
        System.out.println("The sum of all the elements in the array is " + total);
        double average = getAverage(test);
        System.out.println("The average of all the elements in the array is " + average);
        int rowtotal = getRowTotal(test, 0);
        System.out.println("The total of row 0 is " + rowtotal);
        int columntotal = getColumnTotal(test, 0);
        System.out.println("The total of column 0 is " + columntotal);
        int highest = getHighestedInRow(test, 0);
        System.out.println("The highest of row 0 is " + highest);
        int lowest = getLowestInRow(test, 0);
        System.out.println("The lowest of row 0 is " + lowest);
    }

    public static int getTotal(int[][] array) {
        int sum = 0;
        for(int i =0; i<array.length; i++) {
            for(int j=0; j<array[0].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }
    public static double getAverage(int[][] array) {
        int sum = 0;
        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array[0].length; j++) {
                sum += array[i][j];
            }
        }
        double average = sum / (array.length*array[0].length);
        return average;
    }
    public static int getRowTotal(int[][] array, int row) {
        int rowtotal = 0;
        for(int i=0; i<array[0].length; i++) {
            rowtotal += array[row][i];
        }
        return rowtotal;
    }
    public static int getColumnTotal(int[][] array, int column) {
        int columntotal = 0;
        for(int i=0; i<array.length; i++) {
            columntotal += array[i][column];
        }
        return columntotal;
    }
    public static int getHighestedInRow(int[][] array, int row) {
        int highestinrow = array[row][0];
        for(int i=0; i<array[0].length; i++) {
            if(highestinrow < array[row][i]) {
                highestinrow = array[row][i];
            }
        }
        return highestinrow;
    }
    public static int getLowestInRow(int[][] array, int row) {
        int lowestinrow = array[row][0];
        for(int i=0; i<array[0].length; i++) {
            if(lowestinrow > array[row][i]) {
                lowestinrow = array[row][i];
            }
        }
        return lowestinrow;
    }


}
