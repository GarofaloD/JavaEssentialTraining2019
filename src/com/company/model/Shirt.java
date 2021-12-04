package com.company.model;

public class Shirt extends ClothingItem{ //By extending, Shirt now inherits all the functionality of ClothingItem

    //When extending from a super class, it requires a constructor that basically will fullfil the same constructor
    //contract that already exists in the super class
    //Unlike in the superclass, we do not need to pass a type, since the class makes reference to shirts
    public Shirt(ClothingSize size, double price, int quantity) {
        //And since we are working with shirts and only shirts in this class, we can hardwire that item type
        //to what we are passing to the object when using this class
        super(ClothingItem.SHIRT, size, price, quantity);
    }
}
