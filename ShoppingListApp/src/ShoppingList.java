import java.util.ArrayList;

public interface ShoppingList{
    ArrayList<String> items = new ArrayList<String>();
    String getItem(int index);
    int itemCount();
    boolean removeItem(String item);
    void addItem(String item);
    void clearList();
    void printList();
}