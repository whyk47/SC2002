package lab4;

public class Sphere extends Circle{
    public Sphere(double radius) {
        super(radius);
    }

    public Sphere() {
        super();
    }
    public double area() {
        return 4 * super.area();
    }
}
