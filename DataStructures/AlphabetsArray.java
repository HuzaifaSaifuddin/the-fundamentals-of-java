import java.util.*;

public class AlphabetsArray {
  public static void main(String[] args) {
    char[] alpha = new char[26];

    for(int i = 0; i < 26; i++) {
      alpha[i] = (char)(97 + i);
    }

    System.out.println(Arrays.toString(alpha));
  }
}
