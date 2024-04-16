import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void systemUpdate() {
        // Test 1: List is empty
        int[] inventoryTest1Input = {};
        Main.systemUpdate(inventoryTest1Input);
        int[] inventoryTest1Output = {};
        assertArrayEquals(inventoryTest1Output, inventoryTest1Input);

        // Test 2: Only one inventory and it is out of stock
        int[] inventoryTest2Input = {0};
        Main.systemUpdate(inventoryTest2Input);
        int[] inventoryTest2Output = {0};
        assertArrayEquals(inventoryTest2Output, inventoryTest2Input);

        // Test 3: Most inventories are out of stock
        int[] inventoryTest3Input = {0, 3, 0, 0};
        Main.systemUpdate(inventoryTest3Input);
        int[] inventoryTest3Output = {0, 0, 3, 0};
        assertArrayEquals(inventoryTest3Output, inventoryTest3Input);
    }
}