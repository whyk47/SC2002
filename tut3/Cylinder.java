package tut3;

public class Cylinder extends Circle {
    protected double height;

    public Cylinder(int x, int y, double radius, double height) {
        super(x, y, radius);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double area() {
        return super.area() * 2 + super.perimeter() * height;
    }

    public double volume() {
        return super.area() * height;
    }

    public String toString() {
        return super.toString() + ", height: " + height;
    }
}
