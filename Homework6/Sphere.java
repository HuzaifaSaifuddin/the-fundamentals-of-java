import java.util.*;

public class GettingObjectOriented {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Enter the radius of the sphere (cm): ");
    String radius = reader.next();

    Sphere userSphere = new Sphere(Double.parseDouble(radius));

    System.out.println("Diamter of the Sphere is " + userSphere.diameter() + " cm");
    System.out.println("Circumference of the Sphere is " + userSphere.circumference() + " cm");
    System.out.println("Surface Area of the Sphere is " + userSphere.surfaceArea() + " cm2");
    System.out.println("Volume of the Sphere is " + userSphere.volume() + " cm3");
  }
}

public class Sphere {
  private double radius;

  public Sphere(double radius) {
    this.radius = radius;
  }

  public double diameter(){
    return radius * 2.0;
  }

  public double circumference(){
    return 2.0 * Math.PI * radius;
  }

  public double surfaceArea(){
    return 4.0 * Math.PI * Math.pow(radius, 2);
  }

  public double volume(){
    return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
  }
}
