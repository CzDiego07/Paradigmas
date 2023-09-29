package Interfaces;

public class Main {
    public static void main(String[] args) throws Exception {
        Rectangle rectangle = new Rectangle(4.0, 5.2);
        Circle circle = new Circle(10);
        Triangle triangle = new Triangle(10, 10, 5, 5, 9);
        System.out.println("Area of " + rectangle.Name() + ": " + rectangle.calculateArea() + "  Perimeter: "
                + rectangle.calculatePerim());
        System.out.println("Area of " + triangle.Name() + ": " + triangle.calculateArea() + "  Perimeter: "
                + triangle.calculatePerim());
        System.out.println(
                "Area of " + circle.Name() + ": " + circle.calculateArea() + "  Perimeter: " + circle.calculatePerim());

    }
}
