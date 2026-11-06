# Bugs Found and Corrected

## Bug 1: Vending machine constructor uses an invalid array index

### Observed failure
The test failed when it tried to create a new VendingMachine object and tested the testVendingMachine() method. It gave an error message that said: java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4. It failed before we could check the balance or slots.

### Test that exposed the fault
testVendingMachine() in VendingMachineTest.java.

### Source-code fault
The vendingMachine() loop used i <= NUM_SLOTS and because the NUM_SLOTS is 4 (A, B, C, D) the loop allowed i to reach 4. However, an array containing four elements only has valid indexes 0, 1, 2, and 3.

### How I diagnosed the fault
I placed a breakpoint on itemArray[i] = null inside the constructor and debugged the test. I checked i and this.itemArray.length in the Debug Console and it showed the array length was 4 and then I kept pressing continue through the loop and saw the index i increase and go up to 4 which showed the loop was accessing itemArray[4] which is outside the array index.

### Correction
I changed the loop condition from:

i <= NUM_SLOTS

to:

i < NUM_SLOTS

The loop now only accesses indexes 0 through 3.

### Verification
I reran testVendingMachine() after the correction, and it passed. 