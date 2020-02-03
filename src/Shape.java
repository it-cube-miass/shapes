public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return String.format("Shape {color: %s}", color);
    }

    public static Shape findMaxAreaShape(Shape[] arr) {
        Shape maxShape = null;
        double maxArea = Double.NEGATIVE_INFINITY;
        for (Shape shape: arr) {
            double area = shape.getArea();
            if (area > maxArea) {
                maxShape = shape;
                maxArea = area;
            }
        }

        return maxShape;
    }
}
