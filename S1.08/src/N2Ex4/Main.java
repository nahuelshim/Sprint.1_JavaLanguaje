package N2Ex4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> alphanumeric = new ArrayList<>(List.of("Messi campeon del mundo", "Tora","14", "tambor"));

        sortAlphabetically(alphanumeric);
        System.out.println("------------------------------");
        sortWithE(alphanumeric);
        System.out.println("------------------------------");
        sortByReplacing(alphanumeric);
        System.out.println("------------------------------");
        sortByNumeric(alphanumeric);
    }

    public static void sortAlphabetically (List <String> alphanumeric) {
        alphanumeric.stream()
                .sorted()
                .forEach(System.out::println);
    }

    public static void sortWithE (List <String> alphanumeric) {
        alphanumeric.stream().filter(string-> string.contains("e")).forEach(System.out::println);
        alphanumeric.stream().filter(string-> !string.contains("e")).sorted().forEach(System.out::println);
    }

    public static void sortByReplacing (List <String> alphanumeric) {
        alphanumeric.forEach(string -> System.out.println(string.replace("a", "4")));
    }

    public static void sortByNumeric (List <String> alphanumeric) {
        alphanumeric.stream().filter(s -> s.matches("[0-9]*")).forEach(System.out::println);
    }

}
