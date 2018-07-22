package com.MacieQ;

import java.util.Scanner;

public class KalkulatorKonstruktor {

    public static void main(String[] args) {

        Uruchomienie startApki = new Uruchomienie();
        startApki.Uruchomienie();
        System.exit(1);
    }
}

class Uruchomienie{
    public void Uruchomienie(){

        Scanner czytaj = new Scanner(System.in);
        System.out.println("!! Wybierz rodzaj działania !!");
        System.out.println("1 - dodawanie, 2 - odejmowanie, 3 - mnożenie, 4 - dzielenie, 5 - reszta z dzielenia, 6 - potęgowanie, 7 - pierwiastek");

        int wybor = 0;
        try {
            wybor = czytaj.nextInt();
        } catch (Exception e) {
            System.err.println("Podaj cyfrę 1 - 7 \n \n \n " );
            System.out.println(" ");
            Uruchomienie();
        }

        double pierwszaLiczba = 0;
        double drugaLiczba = 0;
        Czytnik uruchomKalkulator = new Czytnik();
        Obliczenia wynik = new Obliczenia();

        if (wybor > 0 && wybor <= 6) {
            pierwszaLiczba = uruchomKalkulator.czytnik("pierwszą");
            drugaLiczba = uruchomKalkulator.czytnik("drugą");
            wynik.obliczenia(wybor, pierwszaLiczba, drugaLiczba);
        } else if (wybor == 7) {
            pierwszaLiczba = uruchomKalkulator.czytnik("");
            wynik.obliczenia(wybor, pierwszaLiczba, drugaLiczba);
        } else {
            System.err.println("Podaj cyfrę 1 - 7  \n \n \n ");
            System.out.println(" ");
            Uruchomienie();
        }


    }

}

class Obliczenia {

    private double pierwszaLiczba, drugaLiczba;

    public void obliczenia(int wybor, double pierwszaLiczba, double drugaLiczba) {
        this.pierwszaLiczba = pierwszaLiczba;
        this.drugaLiczba = drugaLiczba;

        switch (wybor) {
            case 1: {
                System.out.println("Wynik dodawania to: " + (pierwszaLiczba + drugaLiczba));
                break;
            }
            case 2: {
                System.out.println("Wynik odejmowania to: " + (pierwszaLiczba - drugaLiczba));
                break;
            }
            case 3: {
                System.out.println("Wynik mnożenia to: " + (pierwszaLiczba * drugaLiczba));
                break;
            }
            case 4: {
                System.out.println("Wynik dzielenia to: " + (pierwszaLiczba / drugaLiczba));
                break;
            }
            case 5: {
                System.out.println("Wynik reszty z dzielenia to: " + pierwszaLiczba % drugaLiczba);
                break;
            }
            case 6: {
                System.out.println("Wynik potęgowania: " + Math.pow(pierwszaLiczba, drugaLiczba));
                break;
            }
            case 7: {
                System.out.println("Wynik pierwiastkowania II-stopnia to: " + Math.sqrt(pierwszaLiczba));
                break;
            }
            default: {
                System.err.println("Błędny wybór!");
                break;
            }
        }
    }

}
class Czytnik {

    public double czytnik(String napis) {

        Scanner czytaj = new Scanner(System.in);

        System.out.print("Podaj " + napis + " liczbę: ");
        double liczba = 0;

        try {
            liczba = czytaj.nextDouble();
        } catch (Exception e) {
            System.err.println("Niepoprawna wartość");
            System.exit(1);
        }
        return liczba;
    }

}
