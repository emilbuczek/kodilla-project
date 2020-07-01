package com.Kodilla.abstractt.homework.homework2;

public class Application {
    public static void main(String[] args) {
        Shape FirstCircle = new FirstCircle();
              FirstCircle.getShape();
        Shape SecondCircle= new SecondCircle();
              SecondCircle.getShape();
        CircleProcessor Processor = new CircleProcessor(30.7, 3.1415927 ) {

            @Override
            public void getShape() {

            }

            @Override
            double circuitArea() {
                return 0;
            }

            @Override
            double surfaceArea() {
                return 0;
            }
        };
        Processor.process(SecondCircle);
    }
}
