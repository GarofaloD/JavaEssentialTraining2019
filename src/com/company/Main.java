package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] months =
                {"January", "February", "March",
                        "April", "May", "June",
                        "July", "August", "September",
                        "October", "November", "December"};


        //Basic ForLoop - Old way
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i] + "Old way");
        }

        //Basic for loop - New way
        for (String month : months) { //creates a map out of the elements of the array into a string
            System.out.println(month + "New way");
        }

        //Stream??
        Arrays.stream(months).forEach(System.out::println);

        //While loop basic
        var whileCounter = 0;
        while (whileCounter < months.length){
            System.out.println(months[whileCounter++] + " with While loop");
        }

        //do while loop basic
        var doWhileCounter = 0;
        do{
            System.out.println(months[doWhileCounter] + " with do while basic");
            doWhileCounter++;
        } while(doWhileCounter < months.length);

    }
}
