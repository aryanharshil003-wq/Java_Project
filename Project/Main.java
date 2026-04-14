// Class to represent Circle
class Circle {

    double radius;   

    // Constructor to initialize radius
    Circle(double r){
        this.radius = r;   
    }

    // Method to calculate area of circle
    double calculateArea(){
        return 3.14 * radius * radius;  
    }
}

// Class to represent Square
class Square {

    double side;  

    // Constructor to initialize side
    Square(double s){
        this.side = s;  
    }

    // Method to calculate area of square
    double calculateArea(){
        return side * side;   
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {

        // Creating objects of classes
        Circle c = new Circle(5);
        Square s = new Square(4);

        // Calling methods to calculate and display area
        System.out.println("Area of Circle: " + c.calculateArea());
        System.out.println("Area of Square: " + s.calculateArea());
    }
}