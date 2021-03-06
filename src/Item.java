/**
 * Author: Anthony Cangelosi
 * Description: Item Interface made to provide the basis for every item to
 * be put into production
 * Date: 9/29/18
 */

//importing java utilities to allow creation of a date method

import java.util.Date;

/*An interface can only have methods with empty bodies. Any implementation of an interface
requires the use of each method in the interface.*/
public interface Item {

  final String manufacturer = "OracleProduction";

  public void setProductionNumber(int pn);//Method to track the production number

  public void setName(String name);//Method to set the item name

  public String getName();//Getter to access the name

  public Date getManufacturerDate();//Getter to retrieve the date and time

  public int getSerialNumber();//Method to retrieve the item serial number
}
