public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 1);
        Point p3 = new Point(1.5, 2);

        Circle c = new Circle(p1, 1, "green");
        Square s = new Square(p1, 1, "blue");
        Triangle t = new Triangle(p1, p2, p3, "red");

        Shape[] shapes = new Shape[]{c, s, t};
        printArrayElements(shapes);

        Shape maxShape = Shape.findMaxAreaShape(shapes);
        System.out.printf("Shape with max area: %s \n", maxShape);
    }

    private static void printArrayElements(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ": " + arr[i]);
        }
    }
}