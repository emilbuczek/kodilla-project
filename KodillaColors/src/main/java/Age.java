public class Age {
    String name;
    double age;
    double height;

    ///                                                            poniżej znajduję się konstruktor
    public Age(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    ////                                                                       metody/funkcje
    public void checkAge() {
            if (age > 30 && height > 160) {
                System.out.println("User is older than 30 and higher then 160cm");
            } else {
                System.out.println("User is younger than 30 or lower than 160cm");
            }
        }
    }



