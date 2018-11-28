/**
 * Author: Anthony Cangelosi
 * Description: Abstract Product class to create and display a full
 * product, utilizing the basis from the Item Interface.
 * Date: 9/29/18
 */

//importing java utilities to allow creation of a date method
import java.util.Date;

/*An abstract class can't be instantiated. Similar to interfaces but can have concrete classes
as well*/
public abstract class Product implements Item, Comparable<Product> {

  //Declaring class variables
  private int serialNumber;
  private String manufacturer;
  private Date manufacuredOn;
  private String name;

  private static int currentProductionNumber = 1;

  //Default Product constructor
  public Product() {
    name = "Default Name";
    serialNumber = currentProductionNumber++;
    manufacuredOn = new Date();
    manufacturer = Item.manufacturer;
  }

  //Constructor taking the String name as a parameter
  public Product(String name) {
    this.name = name;
    serialNumber = currentProductionNumber++;
    manufacuredOn = new Date();
    manufacturer = Item.manufacturer;
  }

  //Implementation of the Item interface methods
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

  @Override
  public int compareTo(Product pro) {
    int ans;
    ans = this.name.compareTo(pro.getName());
    return ans;
  }

  //Formatted toString method to print a pre-formatted message
  public String toString() {
    return
        "Manufacturer  : " + manufacturer + "\n"
            + "Serial Number : " + serialNumber + "\n"
            + "Date          : " + manufacuredOn + "\n"
            + "Name          : " + name + "\n";
  }
}
