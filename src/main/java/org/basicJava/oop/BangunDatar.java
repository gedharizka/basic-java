package org.basicJava.oop;
//Super class dari Kotak dan segitiga
public class BangunDatar {
    public static void main(String[] args) {
        Kotak kotak = new Kotak(5);
        System.out.println("Luas kotak :"+kotak.luas());
        kotak.draw();

        System.out.println("===================");

        Segitiga segitiga = new Segitiga(5);
        System.out.println("Luas segitiga :"+segitiga.luas());
        segitiga.draw();
        segitiga.drawSegitigaSamaSisi();
    }
}
