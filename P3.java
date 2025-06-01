class Shape {
    // Method to be overridden by derived classes
    public void showArea() {
        System.out.println("Area calculation is specific to the shape.");
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void showArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void showArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class P3 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        circle.showArea();
        rectangle.showArea();
    }
} 