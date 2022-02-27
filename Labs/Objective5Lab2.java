//Objective5Lab1-If/Else statments that determines if string1 is equivalent to string3
//Nathan Hafley
//Hint: Remember .equals()?

public class Objective5Lab2 {
  public static void main(String[] args) {

    //Declare Varaibles
    String string1 = "Banana";
    String string2 = "Bacon";
    String string3 = "Banana";

    //Compare string1 to string2
    if(string1.equals(string2)) {
      System.out.println(string1 + " is equivalent to " + string2);
    }
    else {
      System.out.println(string1 + " is not equivalent to " + string2);
    }

    //Compare string1 to string3
    if(string1.equals(string3)) {
      System.out.println(string1 + " is equivalent to " + string3);
    }
    else {
      System.out.println(string1 + " is not equivalent to " + string3);
    }
  }
}
