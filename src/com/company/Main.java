package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        //This brings the .io library
        var file = new File("hello.txt");
        System.out.println("File exists: " + file.exists()); //.exists() outputs true or false


        //It is important to use the try/catch because there is a posibility that the file will not be there or that it can be read
        //The reason we are passing the reader is because the 'try' will close them, otherwise we can get memory leaks
        //This is called a Try with resources block.
        try (FileReader fileReader = new FileReader(file);
             BufferedReader br = new BufferedReader(fileReader)) {

            var text = br.readLine();
            System.out.println(text);

        } catch (IOException e) {

            e.printStackTrace();
        }

    }

}
