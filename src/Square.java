public class Square extends Shape {
    private Point corner;
    private double size;

    public Square(Point corner, double size, String color) {
        super(color);
        this.corner = corner;
        this.size = size;
    }

    @Override
    public double getArea() {
        double area = size * size;
        return area;
    }

    @Override
    public String toString() {
        return String.format("Square {corner: %s, size: %s}", corner, size);
    }
}
