package Interfaces;

public interface Figura {
    String Name();

    public double calculateArea();

    public double calculatePerim();
}

// ----------------------------------------------------------------------
class Triangle implements Figura {
    private double base;
    private double height;
    private double sideA;
    private double sideB;
    private double hypotnuse;

    public Triangle(double base, double height, double sideA, double sideB, double hypotnuse) throws Exception {
        // Failure to comply will result in an error
        if (sideA + sideB <= hypotnuse || sideA + hypotnuse <= sideB || sideB + hypotnuse <= sideA) {
            throw new Exception("Error: re-enter the sides ");
        }
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
        this.hypotnuse = hypotnuse;
    }

    @Override
    // Area calculate
    public double calculateArea() {
        double area = 0;
        try {
            area = (base * height) / 2;
        } catch (ArithmeticException e) {
            System.out.println("Error: División entre cero");
        }
        return area;
    }

    @Override
    public String Name() {
        return "Triangle ";
    }

    // perimeter calculate
    public double calculatePerim() {
        return (sideA + sideB + hypotnuse);
    }
}

// ----------------------------------------------------------------------
class Circle implements Figura {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    // Area calculate
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    // perimeter calculate
    public double calculatePerim() {
        return Math.PI * (radius + radius);
    }

    public String Name() {
        return "Circle";
    }
}

// ------------------------------------------------------
class Rectangle implements Figura {
    private double base;
    private double length;

    public Rectangle(double base, double length) {
        this.length = length;
        this.base = base;
    }

    @Override
    // Area calculate
    public double calculateArea() {
        return base * length;
    }

    // Perimeter calculate
    public double calculatePerim() {
        return (base + length);
    }

    public String Name() {
        return "Rectangulo";
    }
}
