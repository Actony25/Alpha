import java.util.Date;

public interface Item {

  final String manufacturer = "OracleProduction";

  public void setProductionNumber(int pn);
  public void setName(String name);
  public String getName();
  public Date getManufacturerDate();
  public int getSerialNumber();
}
