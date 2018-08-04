package com.MacieQ;

import java.util.*;

public class EasySort {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilość cyfr: ");
        int t = scan.nextInt(); //number of numbers

        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            System.out.println("Podaj cyfrę: ");
            lista.add(scan.nextInt());
        }
        Collections.sort(lista);
        Set<Integer> uniqueLista = new HashSet<>(lista);
        System.out.println(lista); // sorted list
        System.out.println(uniqueLista); // sorted list, without dupllicates
    }
}
