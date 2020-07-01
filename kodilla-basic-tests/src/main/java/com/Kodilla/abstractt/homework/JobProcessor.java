package com.Kodilla.abstractt.homework;

public  class JobProcessor extends Person {

    public JobProcessor(String firstName, int age , String job) {
        super("Emil", 30, "tester");
    }

    public void process(Job job) {
    System.out.println("My name is" + " " + firstName + " " + "and my job is" + " " + job.getNameOfResponsibilities());
    }
}
