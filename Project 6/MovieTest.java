/**
 * Created by byu on 7/3/2017.
 */
public class MovieTest {
    public static void main(String[] args){
        Movie johnwick = new Movie("John Wick", "R", 0,0,0,0,5);
        Movie cars = new Movie("Cars 3", "G", 0, 2, 1, 2, 0);
        johnwick.addRating(4);
        johnwick.addRating(2);
        cars.addRating(5);
        cars.addRating(1);
        johnwick.addRating(5);
        System.out.println("The movie " + johnwick.getName() + " has a rating of " + johnwick.getRating() + " and an average rating of " + johnwick.getAverage());
        System.out.println("The movie " + cars.getName() + " has a rating of " + cars.getRating() + " and an average rating of " + cars.getAverage());
    }
}
