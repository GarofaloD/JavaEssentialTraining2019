package com.company;

public class Main {

    //STring comparison. It is important to understand that when double equals are used to compare strings, the question
    //that asks is if the two reference variable are in fact referencing the same object in memory

    public static void main(String[] args) {
        String s1 = "Hello!";
        var s2 = "Hello!";

        //this is the wrong way: it returns true since it is comparing to the same string in memory
        if(s1 == s2){
            System.out.println("They match");
        } else {
            System.out.println("They dont match");
        }

        String s3 = new String("Hello");
        String s4 = new String("Hello");

        //this one proves that this is not the right way to do it since it will return false since it is comparing objects
        if(s3 == s4){
            System.out.println("They match");
        } else {
            System.out.println("They dont match");
        }

        //The right way: this one will return true
        if(s3.equals(s4)){
            System.out.println("they match");
        } else {
            System.out.println("They dont match");
        }



    }
}
