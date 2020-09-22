// For Scanner Function
import java.util.*;

public class Conditionals {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Input Now: ");
    String input = reader.next();

    if(input.equals("Huzi")) {
      System.out.println("MORE!");
    } else {
      System.out.println("LESS!");
    }

    // if(input > 10) {
    //   System.out.println("MORE!");
    // } else {
    //   System.out.println("LESS!");
    // }
  }
}
