public class AudioPlayer extends Product implements MultimediaControl {

  String audioSpecification;
  ItemType mediaType;

  public AudioPlayer(String audioSpecification, String name) {
    super(name);
    this.audioSpecification = audioSpecification;
    mediaType = ItemType.AudioMobile;
  }

  @Override
  public void play() {

  }

  @Override
  public void stop() {

  }

  @Override
  public void previous() {

  }

  @Override
  public void next() {

  }
}
