import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
        // arrange
        VendingMachine vm = new VendingMachine();
        VendingMachineItem drink = new VendingMachineItem("drink", 2.00);

        // act
        vm.addItem(drink, "A");

        // assert
        assertSame(drink, vm.getItem("A"));

    }

    @Test
    void testAddItemToFilledSlot() {
        // arrange
        VendingMachine vm = new VendingMachine();
        VendingMachineItem drink = new VendingMachineItem("drink", 2.00);
        VendingMachineItem chips = new VendingMachineItem("chips", 1.50);
        vm.addItem(drink, "A");

        // assert
        assertThrows(VendingMachineException.class, () -> {
            vm.addItem(chips, "A");
        });
        assertSame(drink, vm.getItem("A"));

    }

    @Test 
    void testAddItemWithInvalidCode() {
        // arrange
        VendingMachine vm = new VendingMachine();
        VendingMachineItem drink = new VendingMachineItem("drink", 2.00);

        // assert
        assertThrows(VendingMachineException.class, () -> {
            vm.addItem(drink, "G");
        });
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
