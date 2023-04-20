package N2Ex1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(List.of("Lionel","Nicolas","Ale","Alejandro","ara"));

        names.stream()
                .filter(name->name.startsWith("A") && name.length() == 3)
                .forEach(System.out::println);
    }
}
