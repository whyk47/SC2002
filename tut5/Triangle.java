package tut5;

public class Triangle extends Polygon {
    public Triangle(String theName, float theWidth, float theHeight) {
        super(theName, theWidth, theHeight);
        super.setPolytype(KindofPolygon.POLY_TRIANG);
    }

    public float calArea() { return width * height / 2; }
}
