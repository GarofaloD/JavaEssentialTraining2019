package com.company;

import com.company.model.ClothingItem;
import com.company.model.ClothingSize;
import com.company.model.Hat;
import com.company.model.Shirt;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

        var shirt = new Shirt(
                ClothingSize.L,
                19.99,
                3);

        //Once refactored, we can call the method
        displayItemDetails(shirt);

        var hat = new Hat(ClothingSize.M, 29.99, 1);
        displayItemDetails(hat);

    }

    //New refactored method. What this will do is that it will allow us to bring any type of clothing item
    private static void displayItemDetails(ClothingItem item) {
        var totalPrice = item.getPrice() * item.getQuantity();
        var formatter = NumberFormat.getCurrencyInstance();
        var output = String.format("Your %s %s order will cost %s",
                item.getSize(),
                item.getType(),
                formatter.format(totalPrice));
        System.out.println(output);
    }
}