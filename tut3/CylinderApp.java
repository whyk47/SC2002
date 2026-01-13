package tut3;

public class CylinderApp {
    public static void main(String[] args) {
        Cylinder c = new Cylinder(0, 1, 1.5, 2);
        System.out.println(c.toString());
        System.out.println("Area: " + c.area() + ", Volume: " + c.volume());
    }
}
