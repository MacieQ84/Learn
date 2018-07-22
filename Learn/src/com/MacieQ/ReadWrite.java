package com.MacieQ;

import java.io.*;

public class ReadWrite {
    public static void main(String[] args) {
        String tekst = "tere fere kuku5";
try {

    PrintWriter zapisz = new PrintWriter("c:\\java\\nauka\\out\\plik.txt");
    String sciezka = System.getProperty("user.dir");
    System.out.println(sciezka);
    zapisz.print(tekst);
    zapisz.close();

    FileWriter fw = new FileWriter("c:\\java\\nauka\\out\\plik2.txt");
    fw.write(tekst);
    fw.close();

    /*Scanner czytaj = new Scanner(new FileReader("c:\\java\\nauka\\out\\plik.txt"));
    String odczyt = czytaj.nextLine();
    System.out.println(odczyt);
    */

   // File file = new File("c:\\java\\nauka\\out\\plik.txt");
    FileReader czytaj = new FileReader("c:\\java\\nauka\\out\\plik.txt");
    BufferedReader br = new BufferedReader(czytaj);
    System.out.println(br.readLine());


} catch (Exception e){}


    }
}
