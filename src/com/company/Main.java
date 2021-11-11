package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        //Method invocation - basic
        double d1 = getInput(sc, "Enter the first value:");
        double d2 = getInput(sc, "Enter the second value:");

        double result = d1 / d2;

        System.out.println("The answer is " + result);


    }//:PSVM

    //Basic method refactor - passing values
    private static double getInput(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextDouble();
    }

}//:MAIN

