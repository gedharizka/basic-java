package org.basicJava.oop;

import org.basicJava.oop.fruit.Fruit;

public class MainApp {
    public static void main(String[] args) {
//Instance
        Fruit fruit = new Fruit();
        fruit.gram = 10;
        fruit.calPerGram = 500;
        System.out.println("Total calories :"+fruit.totalCalories());
    }
}


