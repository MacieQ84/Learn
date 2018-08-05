package com.MacieQ;

import java.util.ArrayList;
import java.util.List;

public class SumDigits {
    public static void main(String[] args) {

        System.out.println(sumDigits(1234568946));
    }

/*    public static int sumDigits (int number){

        int sum = 0;
        if (number < 10){
            return -1;
        }

        while (number > 0){
            int digit = number % 10;
            //numbersList.add(sum);
            sum += digit;
            number /= 10;
        }

        return sum;
    }*/

    public static int sumDigits (int number){

        List<Integer> numbersList = new ArrayList<>();
        int sum = 0;
        if (number < 10){
            return -1;
        }

        while (number > 0){
            int digit = number % 10;
            numbersList.add(digit);
            number /= 10;
        }

        sum = 0;
        for (int count:numbersList){
            sum += count;
        }
        return sum;
        // or
        //return numbersList.stream().mapToInt(Integer::intValue).sum();
    }
}
