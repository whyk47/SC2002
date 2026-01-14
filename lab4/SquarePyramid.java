package lab4;

public class SquarePyramid extends Triangle {
    public SquarePyramid(double base, double height) {
        super(base, height);
    }
    
    public SquarePyramid() {
        super();
    }

    public double area() {
        return base * base + 2 * base * Math.sqrt(base * base / 4 + height * height);
    }
}
