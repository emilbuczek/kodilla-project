package com.Kodilla.abstractt.homework.homework2;

public abstract class CircleProcessor extends Shape {


    public CircleProcessor(double r , final double PI){
        super(30.7, PI);}

        public void process(Shape shape){
        System.out.println(shape.circuitArea() + " " + "and" + " " + shape.surfaceArea());
        }
}