//Objective7Lab4-Sum numbers
//Nathan Hafley

public class Objective7Lab4 {
  public static void main(String[] args) {

    //Declare counter and sum variable
    int counter = 1;
    int sum=0;

    //Create loop
    while(counter <= 20) {

      sum=sum+counter;
      counter++;

    }
    System.out.println(sum);
  }
}
