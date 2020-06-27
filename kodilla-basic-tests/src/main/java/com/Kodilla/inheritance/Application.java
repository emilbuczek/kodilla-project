package com.Kodilla.inheritance;

import com.Kodilla.inheritance.Convertible;

public class Application {

    public static void main(String[] args) {
        com.Kodilla.inheritance.Car car = new com.Kodilla.inheritance.Car(4, 5);
        car.turnOnLights();

        Convertible convertible = new Convertible(4, 2);
        convertible.turnOnLights();
        System.out.println(convertible.getSeats());
    }
}