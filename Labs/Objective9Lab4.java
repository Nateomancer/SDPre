//Objective9Lab4-Find average with Method
//Nathan Hafley

//import scanner
import java.util.Scanner;

public class Objective9Lab4 {

  //Main method
  public static void main(String[] args) {

    //create scanner, declare variables
    Scanner kb = new Scanner (System.in);
		double num1, num2;

    //Ask user for decimal input
    System.out.print("Please give me a number: ");
		num1 = kb.nextDouble();
		System.out.print("Please give me another number: ");
		num2 = kb.nextDouble();

    //Call the find Average method
    double average = findAverage(num1, num2);

    //Out the average
    System.out.println("The average of " + num1 + " and " + num2 + " is: " + average);

    kb.close();

  }

  //findAverage method. Takes num1, num2 arguments and calulcates the average.
  //Then returns the answer as a double and sets to it average in the main Method
  public static double findAverage(double x, double y){

    //find the average for num1/num2
    double sum=x+y;
    double average=sum/2;
    return average;

  }

}
