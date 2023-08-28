package org.example;

public class Hangar {
    public static void main(String[] args) {

        Car car1 = new Car("Mercedes", 10_000);
        Boat boat1 = new Boat("Bavaria Yachts", 3_400);

        System.out.println(car1.doStuff());
        System.out.println(boat1.doStuff());
    }
}