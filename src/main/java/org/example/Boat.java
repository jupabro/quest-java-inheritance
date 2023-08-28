package org.example;

public class Boat extends Vehicle {
    public Boat(String brand, int km) {
        super(brand, km);
    }

    @Override
    public String doStuff() {
        return "I am " + super.getBrand() + " and I go glug glug!";
    }
}
