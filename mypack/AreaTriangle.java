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