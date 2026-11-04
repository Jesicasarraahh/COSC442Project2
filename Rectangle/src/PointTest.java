import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class PointTest {

    @Test 
    void testValidValues() {
        //arrange
        double x = 4.0;
        double y = 7.0;
        //act
        Point point = new Point(x, y);
        //assert
        assertEquals(x, point.x, 0.001);
        assertEquals(y, point.y, 0.001);

    }

    @Test 
    void testZeroAndNegativeValues() {
        //arrange
        double x = 0.0;
        double y = -5.0;
        //act
        Point point = new Point(x, y);
        //assert
        assertEquals(x, point.x, 0.001);
        assertEquals(y, point.y, 0.001);
    }
}

    

