package BasicOop;

import java.util.*;

public class GettingObjectOriented {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    Person huzaifa = new Person("Huzaifa", "Pitolwala", new GregorianCalendar(1991, 1, 18));
    // john.firstName = "Huzaifa";
    // john.lastName = "Pitolwala";
    // john.birthday = new GregorianCalendar(1991, 1, 18);

    // Person tasneem = new Person();
    // jane.firstName = "Tasneem";
    // jane.lastName = "Ali";
    // jane.birthday = new GregorianCalendar(1991, 9, 29);

    System.out.println(
      "Hello my name is " + 
      huzaifa.fullName() +
      ". I am " +
      huzaifa.age(new GregorianCalendar()) +
      " years old"
    );
  }
}

public class Person {
  private String firstName;
  private String lastName;
  private Calendar birthday;

  public Person() {
    this.firstName = "";
    this.lastName = "";
    this.birthday = new GregorianCalendar();
  }

  public Person(String firstName, String lastName, Calendar birthday) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthday = birthday;
  }

  public String fullName(){
    return firstName + " " + lastName;
  }

  public int age(Calendar today){
    return today.get(Calendar.YEAR) - birthday.get(Calendar.YEAR);
  }
}
