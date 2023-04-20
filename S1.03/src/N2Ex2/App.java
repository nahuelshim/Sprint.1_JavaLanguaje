package N2Ex2;

import java.text.Collator;
import java.util.*;
import java.util.Collections;

public class App {

    public static void main(String[] args) {

        HashSet<Restaurant> restaurants = new HashSet<Restaurant>();

        restaurants.add(new Restaurant("Pepe", 7));
        restaurants.add(new Restaurant("Pepe", 7));
        restaurants.add(new Restaurant("Pepe", 9));
        restaurants.add(new Restaurant("Carlos", 10));
        restaurants.add(new Restaurant("Sergio", 5));

        System.out.println(restaurants);

        Set<Restaurant> restaurantList = new TreeSet<>(restaurants);

        System.out.println(restaurantList);

    }

}