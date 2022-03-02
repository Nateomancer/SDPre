//Objective9Lab3-Menu method
//Nathan Hafley

import java.util.Scanner;

public class Objective9Lab3 {
  public static void main(String[] args) {

    //Create Scanner and declare variables
    Scanner scanner = new Scanner(System.in);
    int selection;

    //While loop for menu
    while(true){

      //Call print Menu Method
      printMenu();

      //initilaize scanner
      selection=scanner.nextInt();

      //If statemnts based on user input
    if(selection==1){
      System.out.println("Hello Human");
        System.out.println();

    }

    else if(selection==2){
      System.out.println("Apple, Banana, Coconut");
        System.out.println();

    }

    else if(selection==3){
      System.out.println("Goodbye");
      break;
    }

    }

    //Close the scanner
    scanner.close();

  }

  //printMenu method-when called the method will print the menu
  public static void printMenu() {
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }
}
