//Objective 3 Lab 2 - Right Triangle
//Nathan Hafley

/*
side1 * side1 is the equivalent of side squared.
Math.sqrt() is a function available via the Java Math library.
Triangle Formula a2 + b2 = c2
*/

public class Objective3Lab2 {
  public static void main(String[] args) {

    //Declare Variables
    double side1, side2, hypotenuse;

    //Intialize variables
    side1=8;
    side2=10;

    //Find Hypotenuse
    //Remember a2 + b2 = c2
    side1 = side1*side1;
    side2 = side2*side2;
    hypotenuse=Math.sqrt(side1+side2);

    //Output Hypotensue
    System.out.println("Side1 is "+side1);
    System.out.println("Side2 is "+side2);
    System.out.println("The hypotenuse of a triangle with sides 10.0 and 8.0 is "+ hypotenuse);


  }
}
