import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

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
        Method m = null;
        try {
            m = clazz.getMethod("getColor");
            assertEquals("class java.lang.String", m.getReturnType().toString());
        } catch (NoSuchMethodException e) {
            fail("method findMaxAreaShape not found");
        }
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
            Method method = clazz.getMethod("findMaxAreaShape", Shape[].class);
            Class returnValue = method.getReturnType();
            assertEquals("Shape", returnValue.getName(), "incorrect return type");
        } catch (NoSuchMethodException e) {
            fail("method findMaxAreaShape(Shape[] arr) not found");
        }

        class T extends Shape {
            double value;
            T(double value) {
                super("black");
                this.value = value;
            }
            @Override
            public double getArea() {
                return value;
            }
        }
        Shape s1 = new T(4);
        Shape[] arr = {new T(1), new T(2), s1, new T(3)};
        Shape maxAreaShape = Shape.findMaxAreaShape(arr);
        assertEquals(s1, maxAreaShape, "method works incorrected");
    }
}