package game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class FieldOfViewTest {

    private FieldOfView fieldOfView;

    @BeforeEach
    public void setUp() {
        // creating a world with 6 x 6 and 1 depth
        Tile[][][] tiles = new Tile[6][6][1];
        for (int x = 0; x < 6; x++) {
            for (int y = 0; y < 6; y++) {
                tiles[x][y][0] = Tile.FLOOR;
            }

        }

        World world = new World(tiles);
        fieldOfView = new FieldOfView(world);

        fieldOfView.update(2, 2, 0, 3); // Update the field of view with a radius of 5
    }

    @Test
    void testIsVisible() {
        // Test visibility logic here
        boolean visible = fieldOfView.isVisible(3, 2, 0);
        assertTrue(visible);
    }

    @Test
    void testIsVisibleAtNegativeX() {
        boolean visible = fieldOfView.isVisible(-1, 2, 0);
        assertFalse(visible);
    }

    @Test
    void testIsVisibleAtNegativeY() {
        boolean visible = fieldOfView.isVisible(2, -1, 0);
        assertFalse(visible);
    }

    @Test
    void testIsVisibleAtFirstInvalidX() {
        boolean visble = fieldOfView.isVisible(6, 2, 0);
        assertFalse(visble);
    }

   

}
