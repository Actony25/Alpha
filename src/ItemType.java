/**
 Author: Anthony Cangelosi
 Description: ItemType enum to create a special data type of each type of item in production
 Date: 9/29/18
 */

/*An enum is basically creating a special data type that will allow a variable to
be a set of predefined constants.*/
public enum ItemType {

  //Creating each type of ItemType that is currently in production
  Audio("AU"),
  Visual("VI"),
  AudioMobile("AM"),
  VisualMobile("VM");

  //A String to attribute each type to a variable
  private final String Type;

  //Constructor to allow the use of Type outside of the ItemType enum
  ItemType(String Type) {
    this.Type = Type;
  }

  //Get method so the private String type can be accessed outside of this class
  public String getType(){
    return Type;
  }
}
