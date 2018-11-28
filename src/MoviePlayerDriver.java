/**
 * Author: Anthony Cangelosi
 * Description: MoviePlayerDriver is used to test the MoviePlayer class. MoviePlayer objects are
 * created by calling the overloaded MoviePLayer class constructor.
 * Date: 10/27/18
 */

public class MoviePlayerDriver {

  //Method to test the MoviePlayer class in main
  public static void testMoviePlayer() {

    //Creating MoviePlayer objects by calling the overloaded MoviePlayer constructor
    MoviePlayer Movie1 = new MoviePlayer("DBPOWER MK101", new Screen("720x480",
        40, 22), MonitorType.LCD);
    MoviePlayer Movie2 = new MoviePlayer("Pyle PDV156BK", new Screen("1366x768",
        40, 22), MonitorType.LED);

    //Print statements to output the objects
    System.out.println(Movie1);
    System.out.println(Movie2);
  }
}
