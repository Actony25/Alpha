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
    boolean programState = true; //User choice for allowing user to continue using the program
    int mainMenuChoice = 0; //Variable for storing users choice
    int productMenuChoice = 0; //Variable for storing users product choice
    ArrayList<Product> products = new ArrayList<>(); //ArrayList for the collection of products

    System.out.println("Welcome to the Oracle Production Line\n");

    do { //Loop for continued program state. Will continue if true
      do { //Loop for menu choice. Will continue if answer is not between 1 and 3
        System.out.println("What would you like to do today? (Enter a number)");
        System.out.println("1. Add a new product");
        System.out.println("2. Display current products");
        System.out.println("3. Exit the system");

        try {
          mainMenuChoice = scan.nextInt();
        } catch (InputMismatchException ime) {
          System.out.println("Incorrect input");
          System.out.println("Please enter an option number\n");
          scan.nextLine(); //Empties the scanner
        }
      } while (mainMenuChoice < 1
          || mainMenuChoice > 3); //End menuChoice loop. Will end if answer is between 1 and 3

      switch (mainMenuChoice) {
        case 1: //Start case 1: Add new product
          do {
            System.out.println("Which product would you like to add? (Enter a number)");
            System.out.println("1. Audio Player");
            System.out.println("2. Movie Player");
            System.out.println("3. Return to previous menu");

            try {
              productMenuChoice = scan.nextInt();
            } catch (InputMismatchException ime) {
              System.out.println("Wrong input");
              System.out.println("Please enter an option number\n");
              scan.nextLine(); //Empties the scanner
            }
          } while (productMenuChoice < 1
              || productMenuChoice
              > 3); //End productMenuChoice loop. Will end if answer is between 1 and 3

          switch (productMenuChoice) {
            case 1: //Start case 1: Audio Player
              AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");
              products.add(a1);
              System.out.println("Successfully added audio player");
              scan.nextLine(); //Empties the scanner
              break; //End case 1: Audio Player
            case 2: //Start case 2: Movie Player
              MoviePlayer m1 = new MoviePlayer("DBPOWER MK101",
                  new Screen(" 720x480", 40, 22), MonitorType.LCD);
              products.add(m1);
              System.out.println("Successfully added movie player");
              scan.nextLine(); //Empties the scanner
              break; //End case 2: Movie Player
            default: //Start default: Return to previous menu
              break; //End default: Return to previous menu
          }
          break; //End case 1: Add a new product

        case 2: //Start case 2: Display current products
          if (products.isEmpty()) {
            System.out.println("There are no products currently in the system\n");
          } else {
            Collections.sort(products);
            print(products);
          }
          break; //End case 2: Display current products

        case 3: //Start case 3: Exit the system
          System.out.println("Have a nice day. Goodbye");
          programState = false;
          break; //End case 3: Exit the system

        default: //Start default: Exit the system
          programState = false;
          break; //End default: Exit the system
      }

    } while (programState); //End programState loop. Program will end if false
  }
    /*
    // Write one line of code to create an ArrayList of products
    ArrayList<Product> products;
    // Write one line of code to call testCollection and assign the result to the ArrayList
    products = testCollection();
    // Write one line of code to sort the ArrayList
    Collections.sort(products);
    // Call the print method on the ArrayList
    print(products);

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
  }*/

  // Step 16
  // Create print method here
  public static <T extends Iterable<E>, E> void print(T list) {

    for (E element : list) {
      System.out.println(element);
    }
    System.out.println();
  }
}
