//Objective 4 Lab 3 - More Number Input
//Nathan Hafley

/*
Take in the users age using input.nextInt() and store it in the age variable.
Calculate what year the user was born in.
Print out the calculated birthYear.

How old are you?
27
You were born in 1990

*/

//Import scanner
import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {

    //Declare Varaibles
    int birthYear, age, currentYear;

    //Initiaize varaibles
    birthYear = 0;
    currentYear=2022;

    //Create scanner
    Scanner input = new Scanner(System.in);

    //Ask user for birthyear and assign it to birthYear
    System.out.println("How old are you?");
    age=input.nextInt();

    //Calculate birth year
    birthYear=currentYear-age;

    //Output birthYear
    System.out.println("You were born in " + birthYear);

    //Close scanner
    input.close();
  }
}
