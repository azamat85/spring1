package org.example;

public class Cat implements Pet {
    public Cat() {
    }

    @Override
    public void yell() {
        System.out.println("Myau-myau!!!");
    }

    @Override
    public void eat() {
        System.out.println("Кушает");
    }
}
