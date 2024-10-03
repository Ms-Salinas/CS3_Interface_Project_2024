import java.util.Objects;

public class StorageList implements ShoppingList {
    @Override
    public String getItem(int index) {
        return "";
    }

    @Override
    public int itemCount() {
        // Return with amount of items in list
        return items.size();
    }

    @Override
    public boolean removeItem(String item) {
        // Check if the item existed in the list
        boolean itemExists = false;

        for (int i = 0; i < items.size(); i++) {
            if (Objects.equals(items.get(i), item)) {
                itemExists = true;
                items.remove(i);
                break;
            }
        }

        return itemExists;
    }

    @Override
    public void addItem(String item) {
        // Add item to list
        items.add(item);
    }

    @Override
    public void clearList() {
        // Remove everything from the list
        items.clear();
    }

    @Override
    public void printList() {
        System.out.println("In this list, there is: ");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(i + " - " + items.get(i));
        }

        // Determine if list is too large
        if (items.size() >= 10) {System.out.println("This list is too large!");}
        else {System.out.println("This list is compact!");}
    }
}
