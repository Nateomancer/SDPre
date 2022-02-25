//Objective4Lab1 - String Input
//Nathan Hafley

//import statement for scanner
import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

    //Make scanner
    Scanner keyboard = new Scanner(System.in);

    //Declare Varaibles
    String fname = "";
    String lname = "";
    String favoriteAnimal = "";
    String favoriteFood = "";
    String favoriteSong = "";

    //Ask user for input
    //Initilize variables with users input
    System.out.println("What is your first name?");
    fname=keyboard.nextLine();

    System.out.println("What is your last name?");
    lname=keyboard.nextLine();

    System.out.println("What is your favorite animal?");
    favoriteAnimal=keyboard.nextLine();

    System.out.println("What is your favorite Food?");
    favoriteFood=keyboard.nextLine();

    System.out.println("What is your favorite song?");
    favoriteSong=keyboard.nextLine();

    //Output Answers
    System.out.println("My name is "+ fname+" "+ lname+ ".");
    System.out.println("My favorite animal is the " +favoriteAnimal+".");
    System.out.println("My favorite food is "+ favoriteFood+".");
    System.out.println("My favorite song is "+ favoriteSong);

  }
}
