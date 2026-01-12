package tut2;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle(0);
        while (true) {
            printMenu();
            int option = sc.nextInt();
            if (option < 1 || option > 3) {
                System.out.println("Thank you!!");
                break;
            }
            switch (option) {
                case 1: 
                System.out.println("Enter the radius to compute the area and circumference");
                double radius = sc.nextDouble(); 
                c = new Circle(radius);
                System.out.println("A new circle is created");
                break;
                case 2: 
                c.printArea();
                break;
                case 3: 
                c.printCircumference();
                break;
            }
            
        }
        sc.close();
    }

    private static void printMenu() {
        System.out.println("==== Circle Computation =====");
        System.out.println("|1.  Create a new circle    |");
        System.out.println("|2.  Print Area             |");
        System.out.println("|3.  Print circumference    |");
        System.out.println("|4.  Quit                   |");
        System.out.println("=============================");
        System.out.println("Choose option (1-3):");
    }
}
