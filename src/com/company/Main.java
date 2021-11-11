package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Reading input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value:"); //.print keeps the cursor in the same line
        var input = scanner.nextLine();
        System.out.println(input);

        System.out.print("Enter #1:");
        var num1 = scanner.nextInt();
        System.out.print("Enter #2:");
        var num2 = scanner.nextInt();

        var result = num1 + num2;

        System.out.println("The result is: " + result);
    }
}
