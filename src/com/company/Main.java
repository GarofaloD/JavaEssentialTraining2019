package com.company;
import com.company.model.ClothingItem;
import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

        //Use of the constant in the class in such way that we do not need to type and make mistakes
        //The same thing could be applied for the sizes
        var item = new ClothingItem(ClothingItem.SHIRT, ClothingItem.SIZE_M, 19.99, 3);

        var totalPrice = item.getPrice() * item.getQuantity();
        var formatter = NumberFormat.getCurrencyInstance();
        var output = String.format("Your %s order (size %s) will cost %s",
                item.getType(), //first %s
                item.getSize(), //second %s
                formatter.format(totalPrice)); //third %s
        System.out.println(output);
    }


}