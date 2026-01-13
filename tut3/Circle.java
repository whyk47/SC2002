package tut3;

public class Circle extends Point {
    protected double radius;
    
    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    } 

    public double getRadius() {
        return radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return Math.PI * radius * 2;
    }

    public String toString() {
        return super.toString() + "\nRadius: " + radius;
    }
}
