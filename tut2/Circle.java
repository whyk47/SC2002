package tut2;

public class Circle {
    private double radius; // radius of circle
    private static final double PI = 3.14159;
    // constructor
    public Circle(double rad) {
        radius = rad;
    }
    // mutator method – set radius
    public void setRadius(double rad){
        radius = rad;
    }
    // accessor method – get radius
    public double getRadius(){
        return radius;
    }
    // calculate area
    public double area(){
        return PI * radius * radius;
    }
    // calculate circumference
    public double circumference() {
        return PI * radius * 2;
    }
    // print area
    public void printArea(){
        System.out.println("Radius: " + radius);
        System.out.printf("Area: %-14.5f", area());
        System.out.println();
    }
    // print circumference
    public void printCircumference(){
        System.out.println("Radius: " + radius);
        System.out.printf("Circumference: %-14.5f", circumference());
        System.out.println();
    }
}
