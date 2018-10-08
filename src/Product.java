/**
 * Author: Anthony Cangelosi Description: Abstract Product class to create and display a full
 * product, utilizing the basis from the Item Interface. Date: 9/29/18
 */

//importing java utilities to allow creation of a date method

import java.util.Date;

/*An abstract class can't be instantiated. Similar to interfaces but can have concrete classes
as well*/
public abstract class Product implements Item {

  //Declaring class variables
  private int serialNumber;
  private String manufacturer;
  private Date manufacuredOn;
  private String name;

  private static int currentProductionNumber = 1;

  public Product() {
    name = "Default Name";
    serialNumber = currentProductionNumber++;
    manufacuredOn.getTime();
    manufacturer = Item.manufacturer;
  }

  //Constructor taking the String name as a parameter
  public Product(String name) {
    this.name = name;
    serialNumber = currentProductionNumber++;
    manufacuredOn.getTime();
    manufacturer = Item.manufacturer;
  }

  //Implementation of the interface methods
  public void setProductionNumber(int pn) {
    currentProductionNumber = pn;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public Date getManufacturerDate() {
    return manufacuredOn;
  }

  public int getSerialNumber() {
    return serialNumber;
  }

  //Formatting the toString method to print a pre-formatted message
  public String toString() {
    return
        "Manufacturer  : " + manufacturer + "\n"
            + "Serial Number : " + serialNumber + "\n"
            + "Date          : " + manufacuredOn + "\n"
            + "Name          : " + name + "\n";
  }
}
