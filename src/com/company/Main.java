
package com.company;

public class Main {

    //Handle exceptions with try/catch
    public static void main(String[] args) {

        String s = null;

        //Code > Surround with... > try/catch
        try {
            var sub = s.substring(1);
        } catch (Exception e) { //The catch allows you to keep running without the breaking caused by the exception
            e.printStackTrace();
        }

        System.out.println("I'm not dead yet");
    }
}


