import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * The unit test Class for Rectangle.
 */
public class RectangleTest {
    /** Declaring necessary test objects for {@link Rectangle} */
    Rectangle rect1, rect2;
    /**
     * Initializes the necessary test objects for the test cases to use.
     *
     * @throws Exception the exception
     */
    @BeforeEach
    public void setUp() throws Exception {
        rect1 = new Rectangle(new Point(2.0, 2.0), new Point(4.0, 7.0));
        rect2 = new Rectangle(new Point(2.0, 6.0), new Point(4.0, 3.0));
    }
    /**
     * Cleans up test objects after a test case is executed.
     */
    @AfterEach
    public void tearDown() {
        rect1 = null;
        rect2 = null;
    }
    /**
     * Test for the getArea() method of the {@link Rectangle} class.
     */
    @Test
    public void testGetArea() {
        assertEquals(10.0, rect1.getArea(), 0.001);
        assertEquals(6.0, rect2.getArea(), 0.001);
    }
    /**
     * Test for the getDiagonal() method of the {@link Rectangle} class.
     */
    @Test
    public void testGetDiagonal() {
        assertEquals(5.3852, rect1.getDiagonal(), 0.0001);
        assertEquals(3.6056, rect2.getDiagonal(), 0.0001);
    }
}
