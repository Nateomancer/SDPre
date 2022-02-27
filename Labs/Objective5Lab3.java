//Objective5Lab2-Take input from user and determine if greater than, kess than or equal to 0
//Nathan Hafley

/*
Hint: Remember .equals()?

If(string1.equals(string2)) {
  System.out.println(string1 + " is equivalent to " + string2);
}


USING SCANNER:
import java.util.Scanner;
Scanner keyboard = new Scanner(System.in);

Initilize variables with users input:

System.out.println("What is your first name?");
fname=keyboard.nextLine();
*/

import java.util.Scanner;

public class Objective5Lab3 {
    public static void main(String[] args) {

      //Declare Varaibles/Make Scanner
      Scanner scanner = new Scanner(System.in);
      int userNum;

      //Ask user for number input/Assign inout to userNum
      System.out.println("Please enter a number: ");
      userNum=scanner.nextInt();

      //Compare user input to 0
      if(userNum < 0){
        System.out.println("The number is negative");
      }

      else if(userNum > 0){
        System.out.println("The number is positive");
      }

      else if(userNum==0){
        System.out.println("The number is equal to 0");
      }
      
      //Close scanner
      scanner.close();

  }
}
