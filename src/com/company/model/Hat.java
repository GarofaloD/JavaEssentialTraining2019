package com.company.model;

public class Hat extends ClothingItem { //New subclass from ClothingItem

    public Hat(ClothingSize size, double price, int quantity) {
        super(ClothingItem.HAT, size, price, quantity);
    }
}
