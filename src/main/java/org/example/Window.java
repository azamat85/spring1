package org.example;

public class Window implements House {
    public Window() {
    }

    @Override
    public void action() {
        System.out.println("Открыть окно!!!");
    }

    public void action2() {
        System.out.println("Закрыть окно!!!");
    }
}
