public abstract class Shape {
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

    public static Shape findMaxAreaShape (Shape[] arr) {
        Shape shapeWithMaxArea;
        shapeWithMaxArea=arr[0];
        for(Shape s : arr) {
            if(s.getArea() > shapeWithMaxArea.getArea()){
                shapeWithMaxArea = s;
            }
        }
        return shapeWithMaxArea;
    }
}
