package org.basicJava.oop;
// Subclass Bangun dasar
public class Kotak {
    double sisi;

    Kotak(double sisi){
        this.sisi = sisi;
    }

    double luas(){
        return  sisi * sisi;
    }

    void draw(){
        for (int i = 1; i <= sisi; i++) {
            for (int j = 1; j <= sisi; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
