package org.example;

public abstract class Vehicle {

    private String brand;
    private int kilometers;

    public Vehicle(String brand, int km) {
        this.brand = brand;
        this.kilometers = km;
    }

    public abstract String doStuff();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }
}
