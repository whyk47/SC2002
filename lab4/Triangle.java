package lab4;

import java.util.Scanner;

public class Triangle implements Shape {
    protected double base;
    protected double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    public Triangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        base = sc.nextDouble();
        System.out.print("Enter the height: ");
        height = sc.nextDouble();
    }

    public double area() {
        return base * height / 2;
    }
}
