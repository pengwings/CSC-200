/**
 * Created by Brian Yu on 7/9/2017.
 */
public class testAddress {
    public static void main(String[] args){
        Address test1 = new Address(1234, "Main St", "Fairfax","VA", 22030);
        Address test2 = new Address(9876, "Side St", 24, "Mclean", "VA", 22102);
        test1.printAddress();
        test2.printAddress();
        test2.comesBefore(test1);
    }
}
