import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

public class VendingMachineTest {

    @Test 
    void testVendingMachine() {
        VendingMachine vm = new VendingMachine();
        assertEquals(0.0, vm.getBalance(), 0.001);
        assertNull(vm.getItem("A"));
        assertNull(vm.getItem("B"));
        assertNull(vm.getItem("C"));
        assertNull(vm.getItem("D"));

    }
    @Test
    void testAddItem() {
        //arrange
        VendingMachine vm = new VendingMachine();
        VendingMachineItem drink = new VendingMachineItem("drink", 2.00);

        //act
        vm.addItem(drink, "A");

        //assert
        assertSame(drink, vm.getItem("A"));

    }

    @Test
    void testGetBalance() {

    }

    @Test
    void testGetItem() {

    }

    @Test
    void testInsertMoney() {

    }

    @Test
    void testMakePurchase() {

    }

    @Test
    void testRemoveItem() {

    }

    @Test
    void testReturnChange() {

    }
}
