package com.company;

public class Main {

    public static void main(String[] args) {
        Audi audi = new Audi(" A4 ", 4,300.00,4.5, COLORS.RED);
        audi.technic(4, " A4 ");
        System.out.println(audi.getInfo());
        Lexus lexus = new Lexus(new Additional("60 000$", "AVITO"), 2015, "LX330"
        , "330", 4, 300.00, 5.4, COLORS.BLACK);
        System.out.println(lexus.getInfo());
        Lexus lexus2 = new Lexus(new Additional("30 000$", "AVITO"), 2017, "RX200"
                , "200", 3, 280.00, 3.0, COLORS.GREEN);
        System.out.println(lexus2.getInfo());
    }
}
