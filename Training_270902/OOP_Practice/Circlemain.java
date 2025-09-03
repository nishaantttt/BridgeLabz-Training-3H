package Training_270902.OOP_Practice;

public class Circlemain {
    public static void main(String[] args) {
        Circle circle = new Circle(5);

        double area = Math.PI * circle.radius * circle.radius;
        double circumference = 2 * Math.PI * circle.radius;

        System.out.println("Radius: " + circle.radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}
