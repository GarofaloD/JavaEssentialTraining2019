package com.company;

import com.company.model.ClothingSize;
import com.company.model.Shirt;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

        //Then, instead of calling a clothing item, i can directly reference a shirt
        var item = new Shirt(ClothingSize.L, 9.99, 3);

        var totalPrice = item.getPrice() * item.getQuantity();
        var formatter = NumberFormat.getCurrencyInstance();
        var output = String.format("Your %s %s order will cost %s",
                item.getSize(),
                item.getType(),
                formatter.format(totalPrice));
        System.out.println(output);
    }
}