package com.MacieQ;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        //working
        Scanner czytaj = new Scanner(System.in);
        System.out.println("Input value [1-100]: ");
        long inputValue = czytaj.nextLong();
        long result = inputValue;

       do {
           result *= --inputValue;
           System.out.println("Result = " + result+ " " + inputValue);
       } while (inputValue > 2);
       System.out.println("Result = " + result+ " *1");
       czytaj.close();
       System.out.println("\n\n");

        /*
        // also working
        while (inputValue > 1){
            result *= --inputValue;
            System.out.println("Result = " + result + " " + inputValue);
        }*/

    }
}
