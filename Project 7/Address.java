/**
 * Created by Brian Yu on 7/9/2017.
 */
public class Address {
    private int housenumber;
    private String street;
    private Integer apartment;
    private String city;
    private String state;
    private int zip;

    public Address(int housenumber, String street, Integer apartment, String city, String state, int zip){
        this.housenumber = housenumber;
        this.street = street;
        this.apartment = apartment;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Address(int housenumber, String street, String city, String state, int zip){
        this.housenumber = housenumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public void printAddress() {
        if(apartment == null ) {
            System.out.println(housenumber + " " + street);
            System.out.println(city + ", " + state + " " + zip);
        } else {
            System.out.println(housenumber + " " + street + ", " + apartment);
            System.out.println(city + ", " + state + " " + zip);
        }

    }

    public boolean comesBefore(Address other){
        if(other.getZip() > zip){
            System.out.println("This address comes before the other when compared by zip code.");
            return true;
        } else {
            System.out.println("This address comes after the other when compared by zip code.");
            return false;
        }
    }

    public int getHousenumber() {
        return housenumber;
    }

    public void setHousenumber(int housenumber) {
        this.housenumber = housenumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getApartment() {
        return apartment;
    }

    public void setApartment(Integer apartment) {
        this.apartment = apartment;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
}

