package com.company;

public class Main {

    public static void main(String[] args) {

        //multiple catch blocks
        String s = "";

        try {
            var sub = s.substring(1);
        } catch (NullPointerException e) { //NullPointerException is a class that manages null point errors
            //If we limit the exception handlers and we get a different type of error, the catch might not work and
            //the program can break
            e.printStackTrace();
            System.out.println("Null pointer: " + e.getMessage());//getting the message from the exception manager
            //In this case, the NullPointerException
        } catch (StringIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("Out of bounds: " + e.getMessage());//
        } catch (Exception e){ //Exception will catch all exceptions, no matter the origin
            e.printStackTrace();
            System.out.println("Any exception: " + e.getMessage());//getting the message from the exception manager
        }

        System.out.println("I'm not dead yet!");
    }
}
