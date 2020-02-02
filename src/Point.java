public class Point {
    private double x;
    private double y;


    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("Point {x = %s, y = %s}", x, y);
    }

}
