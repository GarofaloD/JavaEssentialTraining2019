package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;


///My solution to the calculator
public class Main {

    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        try {
            System.out.print("Enter a numeric value #1: ");
            var d1 = sc.nextDouble();

            System.out.print("Enter a numeric value #2: ");
            var d2 = sc.nextDouble();

            try {
                System.out.println("Enter the operation you want to run (+ - * /)");
                var operationInput = sc.next();

                double result = 0.0;
                switch (operationInput) {
                    case "+" -> result = d1 + d2;
                    case "-" -> result = d1 - d2;
                    case "*" -> result = d1 * d2;
                    case "/" -> result = d1 / d2;
                    default -> throw new IllegalStateException("Unexpected value: " + operationInput);
                }

                System.out.println("The answer is " + result);

            } catch (IllegalStateException illegalStateException){
                System.out.println("You need to use one of the shown operators");
            }

        } catch (InputMismatchException inputMismatchException){
            System.out.println("Please, enter a valid number");
        }

    }

}

