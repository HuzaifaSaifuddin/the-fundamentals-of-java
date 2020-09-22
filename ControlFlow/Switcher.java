public class Switcher {
  public static void main(String[] args) {
    int x = 5;

    switch(x) {
      case 1: case 4:
        System.out.println("RED");
        break;
      case 2: case 5:
        System.out.println("BLUE");
        break;
      case 3: case 6:
        System.out.println("GREEN");
        break;
      default:
        System.out.println("NONE");
        break;
    }
  }
}
