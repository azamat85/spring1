package org.example;

public class Wall implements House {
    public Wall() {
    }

    @Override
    public void action() {
        System.out.println("Передвинуть стену)");
    }
}
