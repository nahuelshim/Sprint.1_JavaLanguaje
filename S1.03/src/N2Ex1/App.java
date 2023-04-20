package N2Ex1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App {

    public static void main(String[] args) {

        HashSet<Restaurant> restaurants = new HashSet<Restaurant>(); // HashSet no permite objetos duplicados.

        restaurants.add(new Restaurant("Pepe", 7));
        restaurants.add(new Restaurant("Pepe", 7));
        restaurants.add(new Restaurant("Pepe", 9));

        for (Restaurant i: restaurants) {
            System.out.println(i);

        }
    }
}
