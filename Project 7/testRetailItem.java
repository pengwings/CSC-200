/**
 * Created by Brian Yu on 7/9/2017.
 */
public class testRetailItem {
    public static void main(String[] args){
        RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
        RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
        RetailItem item3 = new RetailItem("Shirt", 20, 24.95);

        System.out.println(item1.getDescription());
        System.out.println(item1.getUnitsOnHand());
        System.out.println(item1.getPrice());

        System.out.println(item2.getDescription());
        System.out.println(item2.getUnitsOnHand());
        System.out.println(item2.getPrice());

        System.out.println(item3.getDescription());
        System.out.println(item3.getUnitsOnHand());
        System.out.println(item3.getPrice());
    }
}
