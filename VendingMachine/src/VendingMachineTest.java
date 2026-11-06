import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

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
