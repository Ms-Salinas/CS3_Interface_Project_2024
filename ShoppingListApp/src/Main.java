import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Declare and initialize variables
    static boolean programIsRunning = true;
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<ShoppingList> shoppingListArray = new ArrayList<>();

    public static void main(String[] args) {
        // Greet the user
        System.out.println("Welcome to the shopping list app!");
        System.out.println();

        while (programIsRunning) {
            // Print array list with the number of items in it
            System.out.println("You have..");

            if (!shoppingListArray.isEmpty()) {
                for (ShoppingList shoppingList : shoppingListArray) {
                    int listItemCount = shoppingList.itemCount();
                    // Normal list
                    if (shoppingList.getClass().getName().equals("NormalList")) {
                        System.out.println("A normal list with " + listItemCount + " items.");
                    }
                    // Storage efficient list
                    if (shoppingList.getClass().getName().equals("StorageList")) {
                        System.out.println("A storage list with " + listItemCount + " items.");
                    }
                }
            }
            else {
                System.out.println("No lists.");
            }

            // Give the user some options
            System.out.println();
            System.out.println("1 - Create a new list | 2 - Edit existing list | 3 - Quit");

            int choiceNumber = scanner.nextInt();

            switch (choiceNumber) {
                case 1:
                    int listType = 0;
                    while (listType != 1 && listType != 2) {
                        // Ask the user for a type of list
                        System.out.println("What type of list do you want to create?");
                        System.out.println("1 - Normal list | 2 - Storage efficient list");

                        listType = scanner.nextInt();
                    }
                    // Create list
                    if (listType == 1) {shoppingListArray.add(new NormalList());}
                    if (listType == 2) {shoppingListArray.add(new StorageList());}

                    break;

                case 2: // Edit list
                    // Ask for list index
                    int listIndex = 0;
                    System.out.println("Which list do you want to edit?");
                    listIndex = scanner.nextInt() - 1;

                    // Ask what the user wants to do with the list
                    int choice;
                    System.out.println("\nWhat do you want to do with this list?");
                    System.out.println("1 - Add to list | 2 - Remove from list | 3 - Clear list | 4 - List content | 5 - Done");
                    choice = scanner.nextInt();

                    // When an option is selected..
                    switch (choice) {
                        case 1: // Add to list
                            String itemToAdd;
                            System.out.println("What item do you want to add to the list?");
                            itemToAdd = scanner.next();
                            shoppingListArray.get(listIndex).addItem(itemToAdd);
                            break;

                        case 2: // Remove from list
                            String itemIndexToRemove;
                            shoppingListArray.get(listIndex).printList();
                            System.out.println("What item do you want removed?");
                            itemIndexToRemove = scanner.next();
                            shoppingListArray.get(listIndex).removeItem(itemIndexToRemove);
                            break;

                        case 3: // Clear list
                            shoppingListArray.get(listIndex).clearList();
                            System.out.println("All gone!");
                            break;

                        case 4: // List contents
                            shoppingListArray.get(listIndex).printList();
                            break;
                    }

                    break;

                case 3: // Stop running the program
                    programIsRunning = false;
                    System.out.println("Goodbye!");
                    break;
            }
        }


    }
}