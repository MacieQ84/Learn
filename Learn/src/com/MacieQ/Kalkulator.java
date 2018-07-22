package com.MacieQ;

import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {

        Scanner cyfra = new Scanner(System.in);
        System.out.println("Pierwsza cyfra ");
        int pierwsza = cyfra.nextInt();
        System.out.println("Druga cyfra: ");
        int druga = cyfra.nextInt();

        System.out.println("1 - dodawanie, 2 - odejmowanie, 3 - mnożenie, 4 - dzielenie");
        int wybor = cyfra.nextInt();

        switch (wybor){
            case 1:{
                System.out.println("Wynik dodawania to: " + (pierwsza + druga));
                break;
            }
            case 2:{
                System.out.println("Wynik odejmowania to: " + (pierwsza - druga));
                break;
            }
            case 3:{
                System.out.println("Wynik mnożenia to: " + (pierwsza * druga));
                break;
            }
            case 4:{
                System.out.println("Wynik dzielenia to: " + ((double)pierwsza / (double)druga));
                break;
            }
            default:{
                System.out.println("błędny wybór");
            break;
            }


        }
    }
}

