/**
 * Author: Anthony Cangelosi
 * Description: PlayerDriver is used to test the MoviePlayer and
 * AudioPlayer class. MoviePlayer and AudioPlayer objects are created by calling the overloaded
 * class constructors.
 * Date: 10/27/18
 */

public class PlayerDriver {

  //Method to test the MoviePlayer and AudioPlayer class in main
  public static void testPlayer() {

    //Creating AudioPlayer and MoviePlayer objects to test multimedia control interface
    AudioPlayer Audio = new AudioPlayer();
    MoviePlayer Movie = new MoviePlayer();

    //Method calls to the multimedia control interface methods
    Audio.next();
    Audio.play();
    Audio.previous();
    Audio.stop();
    Movie.next();
    Movie.play();
    Movie.previous();
    Movie.stop();
  }
}
