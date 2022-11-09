package org.example;

public class Employee {
    private String name;
    private int age;
    private Pet pet;
    private Car car;
    private String petName;
    private String modelCar;
    private int yearOfIssue;

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public Employee(String name, int age, Pet pet, Car car, String petName, House house) {
        this.name = name;
        this.age = age;
        this.pet = pet;
        this.car = car;
        this.petName = petName;
        this.house = house;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    private House house;

    public Employee() {
    }

    public Employee(Pet pet, Car car, House house) {
        this.pet = pet;
        this.car = car;
        this.house = house;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
    void myActions (){
        System.out.println("Hi my pet "+petName);
        pet.yell();
        pet.eat();
        System.out.println("My name is "+name+" my age is "+age);
        house.action();
        System.out.print(modelCar+" ");
        car.actionOff();
    }
}
