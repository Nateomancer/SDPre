//Objective8Lab3 Identify odd and even numbers
//Nathan Hafley

public class Objective8Lab3 {
  public static void main(String[] args) {

    //Declare counter i varaiable
    int i=1;

  //for loop
    for (i = 1; i <= 20; i++){

      //Find if i is even or odd, and output answer
      if(i % 2 == 0){
          System.out.println(i+" is even");
        }

        else{
          System.out.println(i+" is odd");
        }
    }
 }
}
