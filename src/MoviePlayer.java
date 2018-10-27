/**
 Author: Anthony Cangelosi
 Description: MoviePlayer class to create and display a movie player. A movie player is a product
 that implements multimedia controls.
 Date: 10/22/18
 */

public class MoviePlayer extends Product implements MultimediaControl {

  //Declaring class variables
  private Screen screen;
  private MonitorType monitorType;

  //Default MoviePlayer constructor
  public MoviePlayer() {
    screen = new Screen();
    monitorType = MonitorType.LCD;
  }

  //Constructor taking String name as a parameter
  public MoviePlayer(String name, Screen screen, MonitorType monitorType) {
    super(name);
    this.screen = screen;
    this.monitorType = monitorType;
  }

  //Implementation of the MultimediaControl interface methods
  public void play() {
    System.out.println("Playing movie");
  }

  public void stop() {
    System.out.println("Stopping movie");
  }

  public void previous() {
    System.out.println("Previous movie");
  }

  public void next() {
    System.out.println("Next movie");
  }

  //Formatted toString method to print a pre-formatted message
  public String toString() {
    return super.toString()
      + "Screen Specs  : " + screen + "\n"
      + "Monitor Type  : " + monitorType + "\n";
  }
}
