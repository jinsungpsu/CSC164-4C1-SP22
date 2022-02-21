import java.util.Scanner;
/*
Write a shopping list with 5 items

First you enter 5 items name's in the console
Then it prints out your list in reverse order

Example:

Enter groceries
bananas
Enter groceries
apples
Enter groceries
milk
Enter groceries
chicken
Enter groceries
napkins

napkins
chicken
milk
apples
bananas

 */
public class ShoppingList{
    static Scanner keyboard = new Scanner(System.in);

    //Method 1
    //Enter groceries
    public static void writeList(String[] shoppingList){
        String item = "";

        for (int i = 0; i <= shoppingList.length; i++) {
            System.out.println("Enter groceries");
            item = keyboard.next();
            shoppingList[i] = item;
        }
    }

    //Method 2
    //print reverse list
    public static void printList(String[] shoppingList){
        int i = shoppingList.length;
        while(i > 0){
            System.out.println(shoppingList[i]);
        }
    }

    public static void main(String[] args) {
        String[] shoppingList = new String[5];
        writeList(shoppingList);
        printList(shoppingList);
    }
}
