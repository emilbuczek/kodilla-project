package com.Kodilla.abstractt.homework.homework2;

public class FirstCircle extends Shape {
    public FirstCircle(){
        super(30.7, PI );
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
