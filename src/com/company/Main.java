package com.company;

import com.company.model.ClothingItem;
import com.company.model.ClothingSize;
import com.company.model.Hat;
import com.company.model.Shirt;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

        //Simple Array. Fixed length. Useful when we know exactly what is it that we are storing
        String[] colors = new String[3];  //# items in the array
        colors[0] = "Red";
        colors[1] = "Green";
        colors[2] = "Blue";

        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        ClothingItem[] items = {
                new Shirt(
                        ClothingSize.L,
                        19.99,
                        3),
                new Hat(
                        ClothingSize.M,
                        29.99,
                        1)
        };

        //We can then pass all the items in the array to the method
        for (ClothingItem clothingItem: items) {
            displayItemDetails(clothingItem);
        }



    }

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