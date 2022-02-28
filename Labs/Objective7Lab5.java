//Objective7Lab5-Menu System
//Nathan Hafley

import java.util.Scanner;

public class Objective7Lab5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while (true) {
      System.out.println("_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My favorite foods");
      System.out.println("3: Exit");
      System.out.println();
      System.out.println("Please enter a number:");
      System.out.println();

      //Input from user
      selection = scanner.nextInt();

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
    scanner.close();
  }
}
