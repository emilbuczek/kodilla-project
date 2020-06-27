package com.Kodilla.inheritance;

public class Convertible extends com.Kodilla.inheritance.Car {


    public Convertible(int wheels, int seats) {
        super(wheels , seats);
    }

    public void openRoof() {
        System.out.println("Opening roof...");
    }

    public void closeRoof() {
        System.out.println("Closing roof...");
    }

    @Override
    public void openDoors() {
        System.out.println("Opening 2 doors");
    }
}