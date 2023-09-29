package org.basicJava.oop;

public class Car {

        String bahanBakar;
        int tahunPembuatan = 2000;
//Constructor
        Car(String bahanBakar){
            this.bahanBakar = bahanBakar;
        }

        void warna(){
            System.out.println("berwarna merah");
        }

        void mesin(){
            System.out.println("bermesin 1800CC");
        }

        int getTahunPembuatan(){
            return tahunPembuatan;
        }

        String getBahanBakar(){
            return  bahanBakar;
        }


}
