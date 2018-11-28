/**
 * Author: Anthony Cangelosi
 * Description: Screen implements ScreenSpec to create monitors. A Screen is defined by its
 * resolution, refresh rate, and response time.
 * Date: 10/27/18
 */

public class Screen implements ScreenSpec {

  //Declaring class variables
  private String resolution;
  private int refreshRate;
  private int responseTime;

  //Default Screen constructor
  public Screen() {
    this.resolution = "Default";
    this.refreshRate = 0;
    this.responseTime = 0;
  }

  //Constructor taking String resolution, integer refreshRate, integer responseTime as parameters
  public Screen(String resolution, int refreshRate, int responseTime) {
    this.resolution = resolution;
    this.refreshRate = refreshRate;
    this.responseTime = responseTime;
  }

  //Implementation of Screen interface methods
  public String getResolution() {
    return resolution;
  }

  public int getRefreshRate() {
    return refreshRate;
  }

  public int getResponseTime() {
    return responseTime;
  }

  //Formatted toString method to print a pre-formatted message
  public String toString() {
    return
        "Resolution    : " + resolution + "\n"
            + "                Refresh Rate  : " + refreshRate + "\n"
            + "                Response Time : " + responseTime;
  }
}
