package lab4;

import java.util.Scanner;

public class Circle implements Shape {
    protected double radius;

    public Circle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        radius = sc.nextDouble();
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}
