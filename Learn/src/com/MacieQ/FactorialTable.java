package com.MacieQ;

import java.util.Scanner;

public class FactorialTable {
    public static void main(String[] args) {

        Scanner czytaj = new Scanner(System.in);
        System.out.println("Number of tests [1-100]: ");
        int[] factorialTable = new int[czytaj.nextInt()];
        for (int i = 0; i < factorialTable.length; i++) {
            System.out.println("Add number " + (i + 1) + " to factorial:");
            factorialTable[i] = czytaj.nextInt();
        }
        czytaj.close();

        for (int i = 0; i < factorialTable.length; i++) {
            System.out.println("Result of factorial number " + factorialTable[i] + " = " + doFactorial(factorialTable[i]));
        }
    }

    public static String doFactorial (int inputValue){
        long result = inputValue;
        do {
            result *= --inputValue;
        } while (inputValue > 2);
        return String.valueOf(result);
    }
}
