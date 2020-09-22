// For Scanner Function
import java.util.*;

public class Conditionals {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Input Now: ");
    String input = reader.next();
    String sOne = "abc";
    String sTwo = "z";

    if (input.contains(sOne) || input.contains(sTwo)) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }
  }
}
