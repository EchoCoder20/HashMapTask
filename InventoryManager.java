import java.util.HashMap;
import java.util.Map;

class InventoryManager {
    private Map<String, Integer> inventory = new HashMap<>();

    public InventoryManager() {
        inventory.put("Apples", 50);
        inventory.put("Oranges", 30);
    }

    /**
     * TO-DO: Add 'quantityToAdd' to the stock of 'itemName'.
     * If 'itemName' doesn't exist, add it to the map with that quantity.
     \*
     * @param itemName The name of the item to restock.
     * @param quantityToAdd The number of items to add.
     */
    public void restockItem(String itemName, int quantityToAdd) {
        // Hint: Use getOrDefault() to simplify your code.
        inventory.put(itemName, inventory.getOrDefault(itemName,0)+quantityToAdd);

    }

    public Map<String, Integer> getInventory() {
        return inventory;
    }
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        // Restock existing item
        manager.restockItem("Apples", 20);

        // Add new item
        manager.restockItem("Bananas", 15);

        // Print the inventory
        for (Map.Entry<String, Integer> entry : manager.getInventory().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}