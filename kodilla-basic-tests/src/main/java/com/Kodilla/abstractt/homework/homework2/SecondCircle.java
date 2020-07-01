package com.Kodilla.abstractt.homework.homework2;

public class SecondCircle extends Shape {
    public SecondCircle() {
        super(10.6, PI);
    }

    @Override
    public void getShape() {

    }
    @Override
    double circuitArea() {
        return PI * r * r;
    }

    @Override
    double surfaceArea() {
        return 2 * PI * r;
    }
}
