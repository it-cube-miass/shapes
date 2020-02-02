public class Circle extends Shape {
    private Point center;
    private double radius;



    public Circle(Point center, double radius, String color) {
        super(color);
        this.center = center;
        this. radius = radius;
    }

    @Override
    public double getArea() {
        double area;
        area = Math.PI * radius * radius;
        return area;
    }

    @Override
    public String toString() {
        return String.format("Circle {center: %s, radius = %s}", center, radius);
    }
}
