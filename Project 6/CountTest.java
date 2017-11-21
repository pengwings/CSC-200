/**
 * Created by byu on 7/2/2017.
 */
public class CountTest {
    public static void main(String[] args){
        Counter test = new Counter();
        test.addOne();
        test.printCount();
        test.addOne();
        test.printCount();
        test.minusOne();
        test.printCount();
        test.minusOne();
        test.printCount();
        test.minusOne();
        test.printCount();
        test.addOne();
        int count = test.getCount();
        System.out.println(count);


    }
}
