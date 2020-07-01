package com.Kodilla.abstractt.homework.homework2;

public abstract class Shape {
    public double r;
    static final double PI= 3.1415927;

    public Shape(double r , double PI){
        this.r=r;
    }

 public abstract void getShape();

    abstract double circuitArea();

    abstract double surfaceArea();
}
