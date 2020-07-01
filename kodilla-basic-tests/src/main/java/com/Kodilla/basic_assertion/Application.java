package com.Kodilla.basic_assertion;

public class Application {
        public static void main(String[] args) {
            Calculator calculator = new Calculator();
            int a = 5;
            int b = 8;
            int addResult = calculator.add(a, b);
            boolean correct = ResultChecker.assertEquals(13, addResult);
            if (correct) {
                System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
            } else {
                System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
            }
            int subResult = calculator.sub(a, b);
            boolean correctSecond = ResultChecker.assertEquals(-3,addResult);
            if(correctSecond){
                System.out.println("It is working correct");
            }else {
                System.out.println("It is not working correct");
            }
            int toSquareResult = calculator.toSquare(a);
            boolean correctThird = ResultChecker.assertEquals(25,toSquareResult);
            if(correctThird) {
                System.out.println("It is good");
            }else{
                System.out.println("It is very very bad");
            }


        }

}

