package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the first value:");
        var num1 = scanner.nextDouble();
        System.out.println("Please, enter the second value:");
        var num2 = scanner.nextDouble();

        double result = num1 / num2;

        System.out.println("The result is: " + result);
    }
}
