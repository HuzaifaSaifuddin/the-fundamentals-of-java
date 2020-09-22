/*
  Fundamentals of JAVA
  HomeWork Assignment 5
  STUDENT : Huzaifa Pitolwala
*/

import java.util.*;

public class Palindrome {
  public static void main(String [] args){
    String original = "";
    Scanner reader = new Scanner(System.in);

    System.out.print("Enter a string to check Palindrome: ");
    original = reader.nextLine();

    System.out.println(isPalindrome(original));
  }

  public static boolean isPalindrome(String original){
    int i = 0;
    int j = original.length() - 1;
    while(i < j) {
      if(original.charAt(i) != original.charAt(j)) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }
}
