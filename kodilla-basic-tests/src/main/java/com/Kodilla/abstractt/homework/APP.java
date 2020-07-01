package com.Kodilla.abstractt.homework;

public class APP {
    public static void main(String[] args) {
    Job baker = new Baker();
        baker.getJob();
    Job hunter = new Hunter();
        hunter.getJob();

    Job tester = new Tester();
          tester.getJob();
        JobProcessor Processor = new JobProcessor("Emil", 30 , "tester");
        Processor.process(tester);
    }
}

