import java.util.*;

public class ArrayListEcho {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    ArrayList<String> memory = new ArrayList<String>();

    while(true) {
      memory.add(reader.nextLine());
      if(memory.get(memory.size() - 1).equals("END")) {
        break;
      }

      if(memory.get(memory.size() - 1).equals("CLEAR")) {
        memory.clear();
      }

      System.out.println(memory.toString());
    }
  }
}