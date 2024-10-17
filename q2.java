// Define the Shape interface with an abstract method area()
interface Shape {
    double area();  // Abstract method to calculate the area
}

// Class for Circle that implements the Shape interface
class Circle implements Shape {
    private final double radius;  // Radius of the circle (final, cannot be changed)

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement the area() method for a Circle
    @Override
    public double area() {
        final double PI = 3.14159;  // Use final to declare constant PI
        return PI * radius * radius;  // Area of the circle: π * r^2
    }
}

// Class for Sphere that implements the Shape interface
class Sphere implements Shape {
    private final double radius;  // Radius of the sphere (final, cannot be changed)

    // Constructor to initialize the radius
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Implement the area() method for a Sphere (Surface area of sphere)
    @Override
    public double area() {
        final double PI = 3.14159;  // Use final to declare constant PI
        return 4 * PI * radius * radius;  // Surface area of the sphere: 4 * π * r^2
    }
}

// Main class to test the Circle and Sphere area calculation
public class q2 {
    public static void main(String[] args) {
        // Create a Circle object with a radius of 5
        Shape circle = new Circle(5.0);
        System.out.println("Area of Circle: " + circle.area());

        // Create a Sphere object with a radius of 5
        Shape sphere = new Sphere(5.0);
        System.out.println("Surface Area of Sphere: " + sphere.area());
    }
}
