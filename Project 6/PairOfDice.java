/**
 * Created by byu on 7/3/2017.
 */
public class PairOfDice {
    Die dice1 = new Die(6);
    Die dice2 = new Die(6);
    int d1value, d2value;

    public void rollDie(){
        d1value = dice1.roll();
        d2value = dice2.roll();
    }

    public int currentSum(){
        return d1value + d2value;
    }

    public Die getDice1() {
        return dice1;
    }

    public void setDice1(Die dice1) {
        this.dice1 = dice1;
    }

    public Die getDice2() {
        return dice2;
    }

    public void setDice2(Die dice2) {
        this.dice2 = dice2;
    }
}
