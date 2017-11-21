/**
 * Created by Brian Yu on 7/9/2017.
 */
public class RetailItem {
    private String description;
    private int unitsOnHand;
    private double price;

    public RetailItem(String desc, int units, double cost){
        this.description = desc;
        this.unitsOnHand = units;
        this.price = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUnitsOnHand() {
        return unitsOnHand;
    }

    public void setUnitsOnHand(int unitsOnHand) {
        this.unitsOnHand = unitsOnHand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
