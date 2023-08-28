package org.example;

public class Car extends Vehicle {

    public Car(String brand, int km) {
        super(brand, km);
    }

    @Override
    public String doStuff() {
        return "I am " + super.getBrand() + " and I go zoom zoom zoom!";
    }
}
