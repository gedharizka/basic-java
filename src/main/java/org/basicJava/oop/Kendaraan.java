package org.basicJava.oop;

import java.util.Date;

public class Kendaraan {
    public static void main(String[] args) {
        Car mobil = new Car("Pertalite");
        System.out.println("print langsung"+ mobil);
        mobil.warna();
        mobil.mesin();

        System.out.println("Bahannya :"+ mobil.getBahanBakar());
        System.out.println("Tahun pembuatan :"+ mobil.getTahunPembuatan());

        System.out.println("======================================");
        Date date = new Date(1000);
        System.out.println("date :"+ date);
    }
}
