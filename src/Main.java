/**
 * Author: Anthony Cangelosi
 * Description: Main method to produce program output
 * Date: 10/27/18
 */


//Importing java utilities to allow collections to be used
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    /*
    // Write one line of code to create an ArrayList of products
    ArrayList<Product> products = new ArrayList<>();
    // Write one line of code to call testCollection and assign the result to the ArrayList
    products = testCollection();
    // Write one line of code to sort the ArrayList
    Collections.sort(products);
    // Call the print method on the ArrayList
    print(products);

    //Test the EmployeeInfo class
    EmployeeInfo em = new EmployeeInfo();
    System.out.println(em.getName());
    System.out.println(em.getCode());
    */
    ProcessFile pf = new ProcessFile();
    try {
      pf.WriteFile("\nTest7");
      pf.WriteFile("\nTest8");
    } catch (Exception ex) {
      System.out.println("Problem writing to file");
    }
  }

  // Step 15
  // Complete the header for the testCollection method here

  public static ArrayList testCollection() {

    //Creating AudioPlayer and MoviePlayer objects
    AudioPlayer a1 = new AudioPlayer("iPod Mini","MP3");
    AudioPlayer a2 = new AudioPlayer("Walkman","WAV ");
    MoviePlayer m1 = new MoviePlayer("DBPOWER MK101",
        new Screen(" 720x480", 40, 22), MonitorType.LCD);
    MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK",
        new Screen("1366x768", 40, 22), MonitorType.LED);

    // Write one line of code here to create the collection
    ArrayList<Product> products = new ArrayList<>();

    products.add(a1);
    products.add(a2);
    products.add(m1);
    products.add(m2);
    return products;
  }

  // Step 16
  // Create print method here
  public static <T extends Iterable<E>, E> void print ( T list){

    for(E element : list) {
      System.out.println(element);
    }
    System.out.println();
  }
}
