package com.company;

import com.company.model.ClothingItem;
import com.company.model.ClothingSize;
import com.company.model.Hat;
import com.company.model.Shirt;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        //Unordered collections, using key:value pair
        //Maps do not store data in a specific order and are resizeable as well
        Map<String, ClothingItem> items = new HashMap<>();

        items.put("shirt", new Shirt(
                ClothingSize.L,
                19.99,
                3));
        items.put("hat", new Hat(
                ClothingSize.M,
                29.99,
                1));

//        var anItem = items.get("hat");
//        displayItemDetails(anItem);

        //To loop through the Map, we need to find all the keys first. That is the reason we need to list all the keys
        var setOfKeys = items.keySet();
        //then we loop through that list of keys...
        for (String itemKey : setOfKeys) {
            //...and we'll match the items in our list of keys with the keys in the original map to find the value next to the key...
            var item = items.get(itemKey);
            //...then we can pass the item to our method
            displayItemDetails(item);
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