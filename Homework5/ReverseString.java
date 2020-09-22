/*
  Fundamentals of JAVA
  HomeWork Assignment 5
  STUDENT : Huzaifa Pitolwala
*/

import java.util.*;

public class ReverseString {
  public static void main(String[] args) {
    String original = "";
    Scanner reader = new Scanner(System.in);

    System.out.print("Enter a string to reverse: ");
    original = reader.nextLine();

    System.out.println("Reverse of the string: " + reverseStr(original));
  }

  public static String reverseStr(String original) {
    String reverse = "";
    int length = original.length();

    for (int i = length - 1 ; i >= 0 ; i--) {
      reverse = reverse + original.charAt(i);
    }

    return reverse;
  }
}
