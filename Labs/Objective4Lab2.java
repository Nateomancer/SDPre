//Objective 4 Lab 2 - Number Input
//Nathan Hafley

//import scanner
import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    //make scanner
    Scanner keyboard = new Scanner(System.in);

    //declare variables
    int num1 = 0, num2 = 0, num3 = 0, numTotal=0;
    double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0, dubTotal=0;

    //Ask user for int input and assing it to variables num1,num2,num3
    System.out.println("Please enter the first whole number you would like to add.");
     num1 = keyboard.nextInt();
    System.out.println("Please enter the second whole number you would like to add.");
      num2 = keyboard.nextInt();
    System.out.println("Please enter the third whole number you would like to add.");
       num3 = keyboard.nextInt();

    //Ask user for double input and assign it to variables dub1,dub2,dub3
    System.out.println("Please enter the first decimal number you would like to add.");
      dub1 = keyboard.nextDouble();
    System.out.println("Please enter the second decimal number you would like to add.");
      dub2 = keyboard.nextDouble();
    System.out.println("Please enter the third decmail number you would like to add.");
      dub3 = keyboard.nextDouble();

    //Find Sum of the three integers and output the sum
    numTotal=num1+num2+num3;
    System.out.println("The sum of "+num1+"+"+num2+"+"+num3+"="+numTotal);

    //Find the sum of the three doubles and output the sum
    dubTotal=dub1+dub2+dub3;
    System.out.println("The sum of "+dub1+"+"+dub2+"+"+dub3+"="+dubTotal);

  }
}
