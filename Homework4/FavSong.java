/*
  Fundamentals of JAVA
  HomeWork Assignment 4
  STUDENT : Huzaifa Pitolwala
*/
import java.util.*;

public class FavSong {
  public static void main(String[] args) {
    Map<String, String> songDetails = new HashMap<>();

    // Song Details
    songDetails.put("Song", "Yahin Hoon Main");
    songDetails.put("Translation", "I am always here");
    songDetails.put("Rating", "A");
    songDetails.put("Rating Point", "4.5");
    songDetails.put("Artist", "Ayushmann Khurrana");
    songDetails.put("Genre", "Romance");
    songDetails.put("Duration", "1.30");
    songDetails.put("Release Year", "2015");

    // Source Google
    for (Map.Entry<String, String> entry : songDetails.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }
}
