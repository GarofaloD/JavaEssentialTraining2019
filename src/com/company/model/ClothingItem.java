package com.company.model;

//Custom class with getters and setters. No constructor (no arg constructor is created if we are instantiating an object
//without an explicit constructor ..
public class ClothingItem {

    private String type;
    private String size;
    private double price;
    private int quantity;

    //GETTERS
    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    //SETTERS
    public void setType(String type) {
        this.type = type;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
