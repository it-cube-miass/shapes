public class Square extends Shape {
    private final Point corner;
    private final double size;

    public Square(Point corner, double size, String color) {
        super(color);
        this.corner = corner;
        this.size = size;
    }

    @Override
    public double getArea() {
        return size * size;
    }

    @Override
    public String toString() {
        return String.format("Square {corner: %s, size: %.2f, color: %s}", corner, size, getColor());
    }
}
