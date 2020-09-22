/*
  Fundamentals of JAVA
  HomeWork Assignment 5
  STUDENT : Huzaifa Pitolwala
*/

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class RandBetween {
  public static void main(String[] args) {
    int min;
    int max;
    Scanner reader = new Scanner(System.in);

    System.out.print("Enter a min value: ");
    min = reader.nextInt();
    System.out.print("Enter a max value: ");
    max = reader.nextInt();

    if(min >= max) {
      System.out.println("Min cant be greater than or equal to max.");
    } else {
      System.out.println(randInt(min, max));
    }
  }

  // Source Google
  public static int randInt(int min, int max) {
    return ThreadLocalRandom.current().nextInt(min, max + 1);
  }
}
