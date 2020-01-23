public class Circle extends Shape {
    private final Point center;
    private final double radius;

    public Circle(Point center, double radius, String color) {
        super(color);
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle {center: %s, radius: %.2f, color: %s}", center, radius, getColor());
    }
}
