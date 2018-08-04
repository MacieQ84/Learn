package com.MacieQ;

public class IsPrimeAndCount {

    public static void main(String[] args) {

        int count = 0;
        for (int numberToCheck = 1; numberToCheck <= 7920; numberToCheck++)
        {
            if (isPrime(numberToCheck) == true){
                count += 1;
                System.out.println(numberToCheck);
            }
        }
        System.out.println("Number of prime numbers: " + count);
    }

    public static boolean isPrime(int number) {
        if (number == 1)
            return false;
        for (int a = 2; a <= number / 2; a++) {
            if (number % a == 0) {
                return false;
            }
        }
        return true;
    }
}
