//Objective7Lab3-Identify odd and even numbers
//Nathan Hafley

public class Objective7Lab3 {
  public static void main(String[] args) {

    //Declare counter
    int counter = 1;

    //Create loop
    while(counter <= 20) {

      //Determine if counter is even or odd
      if(counter % 2 == 0){
        System.out.println(counter +" is even");
    }

      else{
        System.out.println(counter +" is odd");
    }
      //increment counter
      counter++;
    }
  }
}
