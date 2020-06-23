public class Users {
    public static void main(String[] args) {

        String[] users = {"Anna" , "Beata", "Karol", "Maciej", "Hania", "Donald"};
        int [] year = {19 , 20 ,36 ,24 ,42 };
        User Anna = new User ("Anna", 19);
        User Beata = new User ("Beata", 20);
        User Karol = new User ("Karol", 36);
        User Maciej = new User ("Maciej" , 24);
        User Hania = new User ("Donald", 42);
        int result = 0;
        float sum = 0; //double
        for (int i = 0; i < year.length; i++)
            sum += year[i];

        sum /= year.length;
        System.out.println(sum);

        }

    }

