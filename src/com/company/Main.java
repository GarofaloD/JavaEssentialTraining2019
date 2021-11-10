package com.company;

import javax.lang.model.element.NestingKind;

public class Main {

    public static void main(String[] args) {

        //parse string values
        var s1 = "Welcome to California!";
        System.out.println("length of string:" + s1.length());


        int position = s1.indexOf("California");
        System.out.println("The position of California is: " + position);

        var sub = s1.substring(11); //This one starts from the index specified to the res of the string..
        System.out.println(sub);


        String s2 = "Welcome!          ";
        var len = s2.length();
        System.out.println(len);
        var trimmed = s2.trim();//This one trims any whitespace at the beginning or end of a string
        System.out.println(trimmed.length());//So in this case, you will get the string without whitespaces
    }
}
