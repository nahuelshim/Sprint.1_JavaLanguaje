package N2Ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(3, 7, 10, 14, 21));
        System.out.println(filter(numbers));
    }

    public static String filter(List<Integer> numbers) {

        String leakedNumbers = numbers.stream().map(number -> {
                    if (number % 2 == 0) {
                        return "e" + number;
                    } else {
                        return "o" + number;
                    }
                }).collect(Collectors.joining(", "));

        return leakedNumbers;
    }
}
