package N1Ex3;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Method {

    public static String getName () {
        Scanner sc = new Scanner(System.in);
        System.out.println ("What's your name?");
        String name = sc.nextLine();
        return name;
    }

    public static int challenge () {
        HashMap countries = File.readFile();
        Scanner sc = new Scanner(System.in);
        int points = 0;

        for (int i = 0; i <= 10; i++) {
            Object [] randomCountry = countries.keySet().toArray();
            Object country = randomCountry [new Random().nextInt(randomCountry.length)];

            System.out.println ("What's the capital of " + country);
            String capital = sc.nextLine ();

            if (capital.equalsIgnoreCase(countries.get(country).toString())) {
                points ++;
            }
        }
        return points;
    }
}
