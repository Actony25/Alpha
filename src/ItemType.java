public enum ItemType {

  Audio("AU"),
  Visual("VI"),
  AudioMobile("AM"),
  VisualMobile("VM");

  private final String Type;

  ItemType(String Type) {
    this.Type = Type;
  }

  public String getType(){
    return Type;
  }
}
