package com.MacieQ;

public class PierwszaKlasa {

    public static void main(String[] args) {

        Konstruktor wywolanieKonstruktora = new Konstruktor();
        wywolanieKonstruktora.metWynik("mnożenia");
        wywolanieKonstruktora.metTekst("Tekst");
        wywolanieKonstruktora.setTekst();
    }
}

class Konstruktor {
    private String wynik;
    private String tekst;

    public void metWynik(String wynik) {
        this.wynik = wynik;
        System.out.println("Wynik " + wynik + " to: ");
    }

    public void metTekst(String tekst) {
        this.tekst = tekst;
        System.out.println(tekst);
    }

//why its working ?
    public void setTekst() {
        System.out.println("Set tekst - " + tekst);
    }
}
