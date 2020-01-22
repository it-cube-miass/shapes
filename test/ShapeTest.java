import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    private Shape shape;
    private String color = "green";
    @BeforeEach
    public void createShape() {
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
        boolean hasMethod = false;
        Method[] methods = Shape.class.getMethods();
        for (Method m: methods) {
            if (m.getName().equals("findMaxAreaShape")) {
                hasMethod = true;
                break;
            }
        }
        assertEquals(true, hasMethod, "method findMaxAreaShape not found");


    }
}