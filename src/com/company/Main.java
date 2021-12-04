package com.company;

import com.company.model.ClothingItem;

import javax.swing.text.NumberFormatter;
import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

        var item = new ClothingItem();//new instance of the custom class
        item.setType("Shirt");
        item.setSize("M");
        item.setPrice(19.99);
        item.setQuantity(3);

        var totalPrice = item.getPrice() * item.getQuantity();
        var formatter = NumberFormat.getCurrencyInstance();
        var output = String.format(
                "Your %s order will cost %s",
                item.getType(), //first %s
                formatter.format(totalPrice)); //second %s

        System.out.println(output);
    }


}
