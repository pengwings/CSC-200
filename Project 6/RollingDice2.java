/**
 * Created by byu on 7/3/2017.
 */
public class RollingDice2 {
    public static void main(String[] args){
        PairOfDice pair = new PairOfDice();
        pair.rollDie();
        int sum = pair.currentSum();
        System.out.println("Total sum of dice roll was " + sum);
    }
}
