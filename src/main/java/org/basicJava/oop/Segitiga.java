package org.basicJava.oop;
// Subclass Bangun dasar

public class Segitiga {
    double tinggi;

    Segitiga(double tinggi){
        this.tinggi = tinggi;
    }

    double luas(){
        return 0.5*tinggi*tinggi;
    }

    void draw (){
        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void drawSegitigaSamaSisi(){
        for (int i = 1; i <= tinggi; i++) {

            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print(" ");
            }


            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }


            System.out.println();
        }
    }
}
