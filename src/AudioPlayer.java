/**
 * Author: Anthony Cangelosi
 * Description: AudioPlayer class to create and display an audio player.
 * An audio player is a product that implements multimedia controls.
 * Date: 10/22/18
 */

public class AudioPlayer extends Product implements MultimediaControl {

  //Declaring class variables
  private String audioSpecification;
  private ItemType mediaType;

  //Default AudioPlayer constructor
  public AudioPlayer() {
    this.audioSpecification = audioSpecification;
    mediaType = ItemType.AUDIO;
  }

  //Constructor taking String name and String audioSpecification as parameters
  public AudioPlayer(String name, String audioSpecification) {
    super(name);
    this.audioSpecification = audioSpecification;
    mediaType = ItemType.AUDIO;
  }

  //Implementation of the MultimediaControl interface methods
  public void play() {
    System.out.println("Playing");
  }

  public void stop() {
    System.out.println("Stopping");
  }

  public void previous() {
    System.out.println("Previous");
  }

  public void next() {
    System.out.println("Next");
  }

  //Formatted toString method to print a pre-formatted message
  public String toString() {
    return super.toString()
        + "Audio Spec    : " + audioSpecification + "\n"
        + "Item Type     : " + mediaType + "\n";
  }
}
