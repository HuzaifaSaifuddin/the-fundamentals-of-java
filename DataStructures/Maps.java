import java.util.*;

public class Maps {
  public static void main(String[] args) {
    String[] allNames = { "Huzaifa", "Saifuddin", "Tasneem", "Ali" };

    String[] firstNames = new String[allNames.length/2];
    String[] lastNames = new String[allNames.length/2];

    for(int i = 0; i < allNames.length; i++){
      if(i % 2 == 0) {
        firstNames[i/2] = allNames[i];
      } else {
        lastNames[i/2] = allNames[i];
      }
    }

    System.out.println(Arrays.toString(firstNames));
    System.out.println(Arrays.toString(lastNames));

    Map<String, String> fullNames = new HashMap<>();

    for(int i = 0; i < lastNames.length; i++){
      fullNames.put(lastNames[i], firstNames[i]);
    }

    System.out.println(fullNames);
    System.out.println(fullNames.get("Ali"));
    System.out.println(fullNames.get("Saifuddin"));
    System.out.println(fullNames.get("Madan"));
  }
}
