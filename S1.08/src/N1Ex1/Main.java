package N1Ex1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List <String> players = new ArrayList<>();

        players.add("Messi");
        players.add("Ronaldo");
        players.add("Romario");
        players.add("Ronaldinho");
        players.add("Zidane");

        players.stream().filter(name->name.contains("o")).forEach(System.out::println);
    }
}
