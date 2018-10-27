/**
 Author: Anthony Cangelosi
 Description: MonitorType enum to create a special data type of each type monitor used in production
 Date: 10/22/18
 */

public enum MonitorType {

  //Creating each type of MonitorType that is currently in production
  LCD("LCD"),
  LED("LED");

  //A String to attribute each type to a variable
  private final String Type;

  //Constructor to allow the use of Type outside of the MonitorType enum
  MonitorType(String Type) {
    this.Type = Type;
  }

  //Get method so the private String type can be accessed outside of this class
  public String getType(){
    return Type;
  }
}
