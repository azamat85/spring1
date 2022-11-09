package org.example;

public class Dog implements Pet {

    public Dog() {
    }

    @Override
    public void yell() {
        System.out.println("Gav-gav!!!");
    }

    @Override
    public void eat() {
        System.out.println("Кушает");
    }
}
