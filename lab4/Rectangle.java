package lab4;

import java.util.Scanner;

public class Rectangle implements Shape {
    protected double length;
    protected double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    public Rectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        length = sc.nextDouble();
        System.out.print("Enter the breadth: ");
        breadth = sc.nextDouble();
    }

    public double area() {
        return length * breadth;
    }
}
