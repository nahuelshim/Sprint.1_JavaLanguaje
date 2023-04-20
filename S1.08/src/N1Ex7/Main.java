package N1Ex7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("Pepito");
        words.add("Jose");
        words.add("Hola Don Pepito");
        words.add("Hola Don Jose");
        words.add("Paso usted por mi casa?");
        words.add("Por su casa no pase");

        words.stream()
                .sorted((word1, word2) -> word2.length()-word1.length())
                .forEach(System.out::println);

    }
}
