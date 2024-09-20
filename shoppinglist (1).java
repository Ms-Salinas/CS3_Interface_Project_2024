public interface ShoppingList{
   
    String getItem(int index);
    int itemCount();
    boolean removeItem(String item);
    void addItem(String item);
    void clearList();
    void printList();
}