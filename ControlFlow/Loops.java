// For Scanner Function
import java.util.*;

public class Loops {
  public static void main(String[] args) {
    int i = 5;

    // While Loop
    while(i > 0) {
      System.out.println("Hello World");
      i--;
    }

    Scanner reader = new Scanner(System.in);

    String input;
    String all = "";


    // Do While Loop
    do {
      input = reader.nextLine();
      all += input;
    } while(!input.equals("STOP"));
    System.out.println(all);
  }
}
