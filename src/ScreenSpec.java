/**
 Author: Anthony Cangelosi
 Description: ScreenSpec Interface made to provide the basis for every Screen to be put into production
 Date: 10/22/18
 */

public interface ScreenSpec {

  public String getResolution();//Method to get the screen resolution

  public int getRefreshRate();//Method to get the screen refresh rate

  public int getResponseTime();//Method to get the screen response time
}
