public class Shape {
    private static final double p = Math.PI;
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return Double.NaN;
    }

    @Override
    public String toString() {
        return String.format("Shape {color: %s}", color);
    }
}
