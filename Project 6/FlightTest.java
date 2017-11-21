/**
 * Created by byu on 7/2/2017.
 */


public class FlightTest {
    public static void main(String[] args){
        Flight aa = new Flight("American Airlines", 1234, "Washington, D.C.", "San Francisco");
        aa.setOrigin("Chicago");

        Flight united = new Flight("United", 5678, "Boston", "Los Angeles");
        united.setNumber(4567);

        Flight delta = new Flight("Delta", 1357, "Seattle", "Tokyo");
        delta.setDestination("Osaka");

        Flight jetblue = new Flight("JetBlue", 2468, "New York", "Fort Lauterdale");
        jetblue.setNumber(5432);

        System.out.println(aa.toString());
        System.out.println(united.toString());
        System.out.println(delta.toString());
        System.out.println(jetblue.toString());


    }
}
