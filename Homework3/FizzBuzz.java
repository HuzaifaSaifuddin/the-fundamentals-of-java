/*
  Fundamentals of JAVA
  HomeWork Assignment 3
  STUDENT : Huzaifa Pitolwala
*/
public class FizzBuzz {
  public static void main(String[] args) {
    for(int i = 1; i <= 100; i++){
      if(i % 15 == 0) {
        System.out.println("FizzBuzz");
      } else if(i % 3 == 0) {
        System.out.println("Fizz");
      } else if(i % 5 == 0) {
        System.out.println("Buzz");
      } else {
        // System.out.println(i);
        if(i == 1) {
          System.out.println(i);
        } else {
          int flag = 0;
          for(int n = 2; n < i; n++) {
            if(i % n == 0){
              System.out.println(i);
              flag = 1;
              break;
            }
          }
          if(flag == 0) {
            System.out.println("Prime");
          }
        }
      }
    }
  }
}
