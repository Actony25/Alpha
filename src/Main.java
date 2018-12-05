/**
 * Author: Anthony Cangelosi Description: Main method to produce program output Date: 10/27/18
 */

//Importing java utilities to allow collections to be used

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int menu = 1; //Menu for allowing user to continue using the program
    int answer; //Variable for storing users choice

    System.out.println("Welcome to the Oracle Production Line\n");

    while (menu == 1) {
      System.out.println("What would you like to do today? (Enter a number)");
      System.out.println("1. Add a product");
      System.out.println("2. Display current products");
      System.out.println("3. Exit the system");

      try {
        answer = scan.nextInt();
      } catch (InputMismatchException ime) {
        System.out.println("Incorrect input");
        System.out.println("Please enter an option number");
        continue;
      }

      if (answer == 3) {
        System.out.println("Have a nice day. Goodbye");
        break;
      }
      scan.nextLine();



      /*
      // Write one line of code to create an ArrayList of products
      ArrayList<Product> products;
      // Write one line of code to call testCollection and assign the result to the ArrayList
      products = testCollection();
      // Write one line of code to sort the ArrayList
      Collections.sort(products);
      // Call the print method on the ArrayList
      print(products);
      */

      /*
      //Test the EmployeeInfo class
      EmployeeInfo em = new EmployeeInfo();
      System.out.println(em.toString());
      //Test the ProcessFile class
      ProcessFile pf = new ProcessFile();
      try {
        pf.WriteFile(products);
      } catch (Exception ex) {
        System.out.println("Problem writing to file");
      }
      */
    }
  }

  // Step 15
  // Complete the header for the testCollection method here

  public static ArrayList testCollection() {

    //Creating AudioPlayer and MoviePlayer objects
    AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");
    AudioPlayer a2 = new AudioPlayer("Walkman", "WAV ");
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
  public static <T extends Iterable<E>, E> void print(T list) {

    for (E element : list) {
      System.out.println(element);
    }
    System.out.println();
  }
}
