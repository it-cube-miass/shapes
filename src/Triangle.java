public class Triangle extends Shape {
    private Point a;
    private Point b;
    private Point c;


    public Triangle(Point a, Point b, Point c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double area = 0.5 * Math.abs((a.getX() - c.getX()) * (b.getY() - c.getY()) - (b.getX() - c.getX()) * (a.getY() - c.getY()));
        return area;
    }

    @Override
    public String toString() {
        return String.format("Triangle {a = %s, b = %s, c = %s}", a, b, c);
    }
}
