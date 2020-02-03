public class Triangle extends Shape {
    private final Point a;
    private final Point b;
    private final Point c;

    public Triangle(Point a, Point b, Point c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double dxAC = a.getX() - c.getY();
        double dyBC = b.getY() - c.getY();
        double dxBC = b.getX() - c.getX();
        double dyAC = a.getY() - c.getY();
        return Math.abs(dxAC * dyBC - dxBC * dyAC) / 2;
    }

    @Override
    public String toString() {
        return String.format("Triangle {a: %s, b: %s, c: %s, color: %s}", a, b, c, getColor());
    }
}
