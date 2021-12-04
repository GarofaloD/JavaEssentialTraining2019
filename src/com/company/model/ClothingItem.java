package com.company.model;

public class ClothingItem {

    //Declaration of constants
    public static final String SHIRT = "Shirt";
    public static final String PANTS = "Pants";
    public static final String SHOES = "Shoes";

    public static final String SIZE_S = "S";
    public static final String SIZE_M = "M";
    public static final String SIZE_L = "L";
    public static final String SIZE_XL = "XL";

    private String type;
    private String size;
    private double price;
    private int quantity;

    public ClothingItem(String type, String size, double price, int quantity) {
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
