// Shape Interface
interface Shape {
    double calculateArea();
}

// Circle Class
class Circle implements Shape {
    private double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Implementing interface method
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Square Class
class Square implements Shape {
    private double side;

    // Constructor
    Square(double side) {
        this.side = side;
    }

    // Implementing interface method
    public double calculateArea() {
        return side * side;
    }
}

// Main Class
public class GeometricShapeAreaCalculator {
    public static void main(String[] args) {

        // Polymorphism using interface reference
        Shape s1 = new Circle(5);
        Shape s2 = new Square(4);

        System.out.printf("Area of Circle: %.2f%n", s1.calculateArea());
        System.out.printf("Area of Square: %.2f%n", s2.calculateArea());
    }
}