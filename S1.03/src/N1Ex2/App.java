package N1Ex2;

import java.util.*;

public class App {

    public static void main(String[] args) {

        List <Integer> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);

        List <Integer> backwardsNumbers = new ArrayList<>();

        ListIterator <Integer> it = numbers.listIterator();

        while (it.hasNext()) {
            it.next();
        }

        while (it.hasPrevious()) {
            backwardsNumbers.add(it.previous());
        }
        System.out.println(backwardsNumbers);
    }
}

