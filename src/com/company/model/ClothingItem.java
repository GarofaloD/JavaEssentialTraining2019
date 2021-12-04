package com.company.model;

public class ClothingItem {

    //Constants for the type
    public static final String SHIRT = "Shirt";
    public static final String PANTS = "Pants";
    public static final String SHOES = "Shoes";

    //PROPERTIES
    private String type;

    //In this case, instead of a string it will be based on the enumerator that holds the sizes
    private ClothingSize size;
    private double price;
    private int quantity;

    //CONSTRUCTOR
    public ClothingItem(String type, ClothingSize size, double price, int quantity) {
        this.type = type;
        this.size = size;
        this.price = price;
        this.quantity = quantity;
    }


    //GETTERS & SETTERS
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //The type we are getting is not a string, unlike before: it is an enumerator
    public ClothingSize getSize() {
        return size;
    }
    //Same thing here: the setter is expecting an enumerator in the constructor. That is what we need to pass
    public void setSize(ClothingSize size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
