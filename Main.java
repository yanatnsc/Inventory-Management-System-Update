//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] inventorySample1 = {4, 0, 1, 3, 0, 2, 5, 0};
        systemUpdate(inventorySample1);
        System.out.println("Sample 1: " + Arrays.toString(inventorySample1)); // Output: [4, 0, 0, 1, 3, 0, 0, 2]

        int[] inventorySample2 = {3, 2, 1};
        systemUpdate(inventorySample2);
        System.out.println("Sample 2: " + Arrays.toString(inventorySample2)); // Output: [3, 2, 1]

        int[] inventoryTest1 = {};
        systemUpdate(inventoryTest1);
        System.out.println("Test 1 (List is empty): " + Arrays.toString(inventoryTest1)); // Output: []

        int[] inventoryTest2 = {0};
        systemUpdate(inventoryTest2);
        System.out.println("Test 2 (Only one inventory and it is out of stock): " + Arrays.toString(inventoryTest2)); // Output: [0]

        int[] inventoryTest3 = {0};
        systemUpdate(inventoryTest3);
        System.out.println("Test 3 (Most inventories are out of stock): " + Arrays.toString(inventoryTest3)); // Output: [0, 0, 3, 0]
    }

    public static void systemUpdate(int[] inventory) {
        int countOfZero = 0;

        // Count the number of zeros in the inventory array
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == 0) {
                countOfZero++;
            }
        }

        // Iterate through the inventory array in reverse order
        for (int i = inventory.length - 1, j = inventory.length + countOfZero - 1; i >= 0; i--, j--) {
            if (inventory[i] > 0) {
                // If the current element is not zero, move it to its final position
                if (j < inventory.length) {
                    inventory[j] = inventory[i];
                }
            } else {
                // If the current element is zero, duplicate it and move it to its final positions
                if (j < inventory.length) {
                    inventory[j] = 0;
                }
                j--;
                if (j < inventory.length) {
                    inventory[j] = 0;
                }
            }
        }
    }
}