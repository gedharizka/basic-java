package org.basicJava.polimorphism;

public class Kotak extends BangunDatar {
    @Override
    void draw(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
