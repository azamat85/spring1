package org.example;

public class Door implements House{
    public Door() {
    }

    @Override
    public void action() {
        System.out.println("Открыть дверь!!!");
    }

    public void action2() {
        System.out.println("Закрыть дверь!!!");
    }
}
