/**
 * Created by byu on 7/2/2017.
 */
public class Flight {
    private String name; //airline name
    private int number; //flight number
    private String origin;
    private String destination;

    public Flight(String name, int number, String origin, String destination){
        this.name = name;
        this.number = number;
        this.origin = origin;
        this.destination = destination;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String toString(){
        return name + " flight " + number + " is flying from " + origin + " to " + destination + ".";
    }
}
