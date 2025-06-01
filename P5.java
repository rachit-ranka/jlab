package mypack;

public class AreaTriangle {
    private double base;
    private double height;

    public AreaTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double Area() {
        return 0.5 * base * height;
    }
}


package mypack1;

import mypack.AreaTriangle;

public class Triangle {
    public static void main(String[] args) {
        AreaTriangle obj = new AreaTriangle(10.0, 5.0);
        double area = obj.Area();
        System.out.println("Area of Triangle: " + area);
    }
} 