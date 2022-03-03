//Objective9Lab5-Comprehensive menu
//Nathan Hafley

//import scanner
import java.util.Scanner;

//Class
public class Objective9Lab5 {

//Main method
  public static void main(String[] args) {

    //Create scanner and declare variables
    Scanner kb = new Scanner (System.in);
		double num1, num2;
		boolean keepGoing = true;
		int choice;
		double answer = 0.0;

    // prompt the user to provide one number and store their input in num1
    System.out.println("Please enter a decmial number");
    num1 = kb.nextDouble();


    // Prompt the user for another number and store their input in num2
    System.out.println("Please enter a second decmial number");
    num2 = kb.nextDouble();


    //Beginning of while loop
		while (keepGoing) {
			printMenu();
			System.out.print("Which would you like to do? ");
			choice = kb.nextInt();

      //Beginning of switch statement
			switch (choice) {

        //This case calls the findSum method.
        case 1:
        answer=findSum(num1, num2);
        System.out.println("The sum of "+num1+ " and "+num2+ " is "+ answer);
        break;

        //This case calls the findAverage method
        case 2:
        answer=findAverage(num1, num2);
        System.out.println("The average of "+num1+ " and "+num2+ " is "+ answer);
        break;

        //This case calls the calcTax method
        case 3:
        answer=calcTax(num1, num2);
        System.out.println("The amount in tax to be collected from a purchase of "+num1+ " and "+num2+ " is: "+ answer);
        break;

        //Ends the program
        case 4:
        System.out.println("You have chosen to quit");
        keepGoing=false;
        kb.close();
        break;

        //Triggers when an invalid entry is selected
        default:
        System.out.println("Invalid entry. Please try again");
        break;

      }//switch

    }//While Loop

	}//Main Method

  //Method printMenu
	public static void printMenu() {
		System.out.println();
		System.out.println("========= MENU =========");
		System.out.println("|                      |");
		System.out.println("|   1. Add Numbers     |");
		System.out.println("|   2. Find Average    |");
		System.out.println("|   3. Calculate Tax   |");
		System.out.println("|   4. Exit            |");
		System.out.println("|                      |");
		System.out.println("========================");
		System.out.println();
	}

  //method findSum
	public static double findSum(double x, double y) {
		double sum = x + y;
		return sum;
	}

  //findAverage method
  public static double findAverage(double x, double y){

    double sum=x+y;
    double average=sum/2;
    return average;

  }

  //calcTax method
  public static double calcTax(double x, double y){

    double sum=x+y;
    double tax=sum*.0831;
    return tax;
  }

}//Class
