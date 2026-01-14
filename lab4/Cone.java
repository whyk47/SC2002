package lab4;

import java.util.Scanner;

public class Cone extends Circle {
    protected double height;

    public Cone(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cone() {
        super();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height: ");
        height = sc.nextDouble();
    }

    public double area() {
        double l = Math.sqrt(radius * radius + height * height);
        return super.area() + Math.PI * radius * l;
    }
}
