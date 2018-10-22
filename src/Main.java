public class Main extends AudioPlayer {

  public static void main (String args[]) {

    AudioPlayer Audio = new AudioPlayer("A","B");
    Audio.play();
    Audio.stop();
    Audio.previous();
    Audio.next();
    System.out.println(Audio.toString());
  }
}
