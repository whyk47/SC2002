package lab4;

import java.util.Scanner;

public class Shape2DApp {
    public static double totalArea(Shape[] shapes) {
        double total = 0;
        for (int i = 0; i < shapes.length; i++) {
            total += shapes[i].area();
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of shapes: ");
        int numShapes = sc.nextInt();
        Shape[] shapes = new Shape[numShapes];
        int i = 0;
        while (i < numShapes) {
            System.out.println("Enter the type of shape" + (i+1));
            System.out.println("1. Rectangle");
            System.out.println("2. Triangle");
            System.out.println("3. Circle");
            int type = sc.nextInt();
            switch (type) {
                case 1:
                    shapes[i] = new Rectangle();
                    break;
                case 2:
                    shapes[i] = new Triangle();
                    break;
                case 3:
                    shapes[i] = new Circle();                    
                    break;
                default:
                    System.out.println("Invalid shape type.");
                    i--;
            }
            i++;
        }
        System.out.println("Total area: " + totalArea(shapes));
        sc.close();
    }
}
