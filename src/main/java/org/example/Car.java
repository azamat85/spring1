package org.example;

public class Car {
    private String model;
    private int yearOfIssue;

    public Car() {
    }

    public Car(String model, int yearOfIssue) {
        this.model = model;
        this.yearOfIssue = yearOfIssue;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }
    public void actionOff(){
        System.out.println("Глохнет!");
    }
    public void actionOn(){
        System.out.println("Заыодится!");
    }
}
