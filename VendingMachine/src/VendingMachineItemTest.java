import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class VendingMachineItemTest {
    @Test
    void testGetName() {
        VendingMachineItem donut = new VendingMachineItem("donut", 3.00);
        //act
        String name = donut.getName();
        //assert
        assertEquals("donut",name);


    }

    @Test
    void testGetPrice() {
        //arrange
        VendingMachineItem donut = new VendingMachineItem("donut", 3.00);
        //act
        double price = donut.getPrice();
        //assert
        assertEquals(3.00, price, 0.001);

    }
}
