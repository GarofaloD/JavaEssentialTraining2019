package com.company.model;

public class ClothingItem {
    private String type;
    private String size;
    private double price;
    private int quantity;

    //CONSTRUCTORS
    //No arg constructor but explicitly declared.
    //Both a regular and a no-arg constructor can exist at the same time, but the no-arg takes precedence.
    //Therefore, if the no-arg is commented out, the regular constructor will be the one that will be used and the
    //instantiation of the objects anywhere else will require the use of that constructor for that object
//    public ClothingItem() {
//
//    }

    public ClothingItem(String type, String size, double price, int quantity) {  //Multiple values constructor
        this.type = type;
        this.size = size;
        this.price = price;
        this.quantity = quantity;
    }







    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
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
