public class HelloWorld {
  public static void main(String[] args) {
    char c = 'c';
    String s1 = "string1 ";
    String s2 = "string2 ";
    String s3 = s1 + s2 + "string3";

    s3 = s3.replace('s', 'c');

    System.out.println(s3.toUpperCase());


    String sentence = "The Program Says: \"Hello World\"";
  }
}
