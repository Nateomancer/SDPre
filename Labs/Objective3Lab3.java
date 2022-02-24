//Objective 3 Lab 3 - Calculate the Sum of 3 Random Numbers
//Nathan Hafley

public class Objective3Lab3 {
  public static void main(String[] args) {

//Delcare Variables
int first, second, third, rTotal;

//Initilize variables 1-6 using random function
first=(1 + (int)(Math.random() * 6));
second=(1 + (int)(Math.random() * 6));
third=(1 + (int)(Math.random() * 6));
rTotal=first+second+third;


//output rTotal;
System.out.println(first+"+"+second+"+"+third+"="+rTotal);


  }
}
