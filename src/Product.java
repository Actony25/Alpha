import java.util.Date;

public abstract class Product implements Item {

  private int serialNumber;
  private String manufacturer;
  private Date manufacuredOn;
  private String name;

  private int currentProductionNumber;

  public Product(String name) {
    this.name = name;
    serialNumber = currentProductionNumber++;
    manufacuredOn.getTime();
  }

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

  public String toString() {
    return
          "Manufacturer  : " + manufacturer + "\n"
        + "Serial Number : " + serialNumber + "\n"
        + "Date          : " + manufacuredOn + "\n"
        + "Name          : " + name + "\n";
  }
}
