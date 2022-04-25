package com.example.week13amazon;

import java.util.ArrayList;

public class ProductList {
    private ArrayList<Product> inventory = new ArrayList<>();
    private String title;

    public ArrayList<Product> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Product> inventory) {
        this.inventory = inventory;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "ProductList{" +
                "inventory=" + inventory +
                ", title='" + title + '\'' +
                '}';
    }
}
