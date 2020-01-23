import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    private Shape shape;
    private String color = "green";
    private Class clazz = null;
    @BeforeEach
    public void createShape() throws Exception {
        try {
            clazz = Class.forName("Shape");
        } catch (ClassNotFoundException e) {
            fail("class Shape not found");
        }

        shape = new Shape(color);
    }

    @AfterEach
    public void destroyShape() {
        shape = null;
    }

    @Test
    void getColor() {
        assertEquals(color, shape.getColor());
    }

    @Test
    void getArea() {
        assertEquals(Double.NaN, shape.getArea());
    }

    @Test
    void testToString() {
        String expected = String.format("Shape {color: %s}", color);
        assertEquals(expected, shape.toString());
    }

    @Test
    void findMaxAreaShape() {
        try {
            Method m = clazz.getMethod("findMaxAreaShape");
        } catch (NoSuchMethodException e) {
            fail("method findMaxAreaShape not found");
        }

        Shape s1 = new Shape("green"){
            @Override
            public double getArea() {
                return 2;
            }
        };

        Shape s2 = new Shape("green"){
            @Override
            public double getArea() {
                return 2;
            }
        };
        Shape[] arr = {s1, s2};

        Shape max = Shape.findMaxAreaShape(arr);
        assertEquals(s2, max);
    }
}