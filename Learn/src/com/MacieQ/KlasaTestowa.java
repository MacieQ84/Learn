package com.MacieQ;

public class KlasaTestowa {

    public static void main(String[] args) {


        buildingString();
        System.out.println("");
        obiektyTablice();
        System.out.println("\n");

        Car car = new Car.CarBuilder().setBrand("Citroen")
                .setModel("C4")
                .setColour("Biały")
                .setEngine(1.6)
                .setMileage(97000)
                .carBuild();
        System.out.println(car.toString());
        System.out.println(" ");

    }

    static void buildingString() {
        StringBuilder strBuild = new StringBuilder(" ");
        StringBuffer strBuff = new StringBuffer();

        //String strBuildOut = strBuild.append(3).append(" " + 4).append(" " + 4.3).toString();
        String strBuildOut = strBuild.append("0123456789").toString();
        //strBuildOut = strBuild.replace(0, 2, "abcd").toString();
        strBuildOut = strBuild.reverse().toString();
        int capacityOfStrBuild = strBuild.capacity();
        int lengthOfStrBuild = strBuild.length();

        String strBuffOut = strBuff.toString();
        System.out.println(strBuildOut + "\n" + /*strBuffOut + " " + */
                capacityOfStrBuild + "\n" + lengthOfStrBuild);

    }


    //creating objects, tables and testing modulo
    static void obiektyTablice() {

        Object obiektString = new String();
        Object obiektObiekt = new Object();
        Integer[] obiektInt = new Integer[3];
        int[] tablicaInt = new int[5];

        obiektString = "tekstStringa";
        obiektObiekt = "tekstObiektu";
        obiektInt[2] = 3;
        tablicaInt[2] = 2;
        int wielkoscTablicy = tablicaInt.length;
        System.out.println(obiektObiekt + "\n" + obiektString + "\n" + obiektInt[1] + "\n" + tablicaInt[3] + "\n"
                + wielkoscTablicy);

        // modulo mniejszej przez większą = reszta*większa
        int b = 7 % 12;
        System.out.println("Modulo = " + b);
    }
}
