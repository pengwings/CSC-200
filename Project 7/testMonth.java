/**
 * Created by Brian Yu on 7/9/2017.
 */
public class testMonth {
    public static void main(String[] args){
        Month january = new Month();
        Month march = new Month(3);
        Month july = new Month("July");

        march.setMonthNumber(5);
        System.out.println(march.getMonthNumber());
        march = new Month("May");
        System.out.println(march.getMonthName());
        System.out.println(march.toString());

        march.equals(march);
        march.greaterThan(january);
        march.lessThan(july);

    }

}
