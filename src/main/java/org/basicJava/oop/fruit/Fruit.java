package org.basicJava.oop.fruit;

public class Fruit {
//state
    public int gram;
    public int calPerGram;

//Behavior
    public int totalCalories(){
        return  gram*calPerGram;
    }
}
