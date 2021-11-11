package com.company;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        var scanner = new Scanner(System.in);
//        System.out.print("Enter a month number (1-12): ");
//        var monthNumber = scanner.nextInt();

        var now = LocalDateTime.now(); //Returns current moment in time
        var monthNumber = now.getMonthValue();

        //Basic if
        String message;
//        if (monthNumber < 1 || monthNumber > 12 ){
//            message = "This is not a valid number";
//        } else

         if (monthNumber <= 3){
            message = "That is in Q1";
        } else if (monthNumber <= 6 ){
            message = "That is in Q2";
        } else if (monthNumber <= 9){
            message = "That is in Q3";
        } else {
            message = "That is in Q4";
        }

        System.out.println(message);


    }//:PSVM
}//:MAIN
