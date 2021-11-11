package com.company;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        var now = LocalDateTime.now();
        var monthNumber = now.getMonthValue();

        //Switch statements : this is the new one
        switch (monthNumber) {
            case 1 -> System.out.println("Month is January");
            case 2 -> System.out.println("Month is Feb");
            case 3 -> System.out.println("Month is March");
            case 4 -> System.out.println("Month in April");
            case 5 -> System.out.println("Month is May");
            case 6,7,8,9 -> System.out.println("This is mid year");
            default -> System.out.println("this is by the end of the year");
        }

    }
}
