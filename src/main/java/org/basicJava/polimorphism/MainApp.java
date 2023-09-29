package org.basicJava.polimorphism;

public class MainApp {
    public static void main(String[] args) {
    Calculator calculator = new Calculator();
    calculator.sum(5,5);
    calculator.sum(5,5,5);
    calculator.sum(9.5,9.5);

    // Basic class dan object
    BangunDatar bangunDatar = new BangunDatar();
    bangunDatar.draw();

    // Cara instance method overriding
    BangunDatar kotak = new Kotak();
        System.out.println("========Ovver riding=========");
    kotak.draw();
    }
}
