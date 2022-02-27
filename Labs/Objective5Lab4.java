//Objective5Lab4-Determine if the number is s odd or even using mod
//Nathan Hafley

import java.util.Scanner;

public class Objective5Lab4 {
  public static void main(String[] args) {

    //Create Scanner
    Scanner scanner = new Scanner(System.in);

    //declare variables
    int userNum;

    //ask userfor number/Initilize userNum variable
    System.out.println("Please enter a number:");
    userNum=scanner.nextInt();

    //Determine if number is even or odd using mod

    //
    if(userNum % 2 == 0){
      System.out.println("The number is even");
  }
  else{
    System.out.println("The number is odd");
  }

 }  
}
