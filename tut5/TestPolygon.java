package tut5;

public class TestPolygon {
    public static void printArea(Rectangle r) {
        System.out.println("Area: " + r.calArea());
    }

    public static void printArea(Triangle t) {
        System.out.println("Area: " + t.calArea());
    }

    public static void printAreaDynamic(Polygon p) {
        System.out.println("Area: " + p.calArea());
    }

    public static void main(String[] args) {
        // static binding: Must write a new printArea method for every new polygon subclass.
        Rectangle r = new Rectangle("Rectangle", 10, 20);
        Triangle t = new Triangle("Triangle", 10, 20);
        printArea(r);
        printArea(t);

        // dynamic binding
        printAreaDynamic(r);
        printAreaDynamic(t);


    }
}
