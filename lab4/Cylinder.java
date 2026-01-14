package lab4;

import java.util.Scanner;

public class Cylinder extends Circle {
    protected double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder() {
        super();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height: ");
        height = sc.nextDouble();
    }

    public double area() {
        return super.area() * 2 + 2 * Math.PI * radius * height;
    }
}
