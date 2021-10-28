package com.company;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        var doubleValue = 10_000_000.53;

        var numF = NumberFormat.getNumberInstance(); //Returns a general-purpose number format for the specified locale.
        System.out.println("Number: " + numF.format(doubleValue));


        var intF = NumberFormat.getIntegerInstance();
        System.out.println("Number: " + intF.format(doubleValue)); //rounds the value before returning it


        intF.setGroupingUsed(false);
        System.out.println("Number: " + intF.format(doubleValue)); //this basically removes the separators

        var locale = Locale.getDefault(); //get default value
        var locale2 = Locale.ITALY; //default settings for italy
        var locale3 = new Locale("it", "IT"); //italy settings but with a new instance of the locale settings

        var localeFormatter = NumberFormat.getNumberInstance(locale3); //create a formatter based on the default settings
        System.out.println("Number: " + localeFormatter.format(doubleValue));

        var currencyFormatter = NumberFormat.getCurrencyInstance(locale3);
        System.out.println(currencyFormatter.format(doubleValue));

        var df = new DecimalFormat("$.00");
        System.out.println(df.format(1092835710));

    }
}
