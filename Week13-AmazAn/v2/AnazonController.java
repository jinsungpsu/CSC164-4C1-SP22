package com.example.week13amazon;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.ListView;
import java.util.ArrayList;

public class AnazonController {
    private static ArrayList<Product> inventory = new ArrayList<>();

    @FXML
    private ListView<Product> inventoryContents;

    public void initialize() {
        Product book1 = new Product("Harry Potter 1", "Whiny muggle goes to school.", 20);
        Product book2 = new Product("Where the wild things are", "I know nothing about this book.", 15);
        Product computer = new Product("Macbook", "shiny expensive thing", 1500);

        ProductList clearanceInventory = new ProductList();

        ArrayList<Product> clearanceInventoryItems = clearanceInventory.getInventory();
        clearanceInventoryItems.add(book2);
        //clearanceInventory.getInventory().add(book2);

        ProductList amazAnFreshInventory = new ProductList();

        inventory.add(book1);
        inventory.add(book2);
        inventory.add(computer);

        inventoryContents.getItems().add(book1);
        inventoryContents.getItems().add(book2);
        inventoryContents.getItems().add(computer);

//        String inventoryString = "Current inventory:\n";
//
//        inventoryString += inventory.get(0) + "\n";
//        inventoryString += inventory.get(1);
//
//        inventoryContents.setText(inventoryContents.getText() + inventoryString);

    }

}
