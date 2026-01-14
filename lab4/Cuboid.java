package lab4;

import java.util.Scanner;

public class Cuboid extends Rectangle {
    protected double height;

    public Cuboid(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    public Cuboid() {
        super();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height: ");
        height = sc.nextDouble();
    }

    public double area() {
        return 2 * super.area() + 2 * length * height + 2 * breadth * height;
    }
    
    
}
