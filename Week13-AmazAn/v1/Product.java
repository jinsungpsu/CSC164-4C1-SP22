package com.example.week13amazon;

public class Product {
    private String name, description;
    private double price;

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        String output = "Product name:" + name + '\'' +
                "," + description + '\'' +
                ", price=" + price +
                '}';
        if (price < 18) {
            output += "\nThis product is on clearance!";
        }
        return output;
        /*
        to translate integer to class standing
        you could use enum (enumerated type)
         */
    }
}
