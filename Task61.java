// Create a shape interface and implement Circle, Square, Rectangle
// Code By :- Prof. Shiburaj

interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

}

class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

}


public class Task61 {
    

    public static void main(String[] args) {
        Shape c1 = new Circle(5);
        Shape s1 = new Square(5);
        Shape r1 = new Rectangle(5, 10);

        System.out.println("Circle area: " + c1.calculateArea());
        System.out.println("Square area: " + s1.calculateArea());
        System.out.println("Rectangle area: " + r1.calculateArea());
    }
}
