package com.company;

public class Main {
 //String interpolation
    public static void main(String[] args) {

        var item = "Shirt";
        var size = "M";
        var price = 14.99;
        var color = "Red";

        var template = "Clothing item: %s, size %s, color %s, $%.2f";
        //This is a way that we can do template literals and formatting at the same time

        var itemString = String.format(template, item, size, color, price);
        System.out.println(itemString);


    }
}
