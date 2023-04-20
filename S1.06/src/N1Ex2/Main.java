package N1Ex2;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Lionel", "Messi", 35);
        String country = "Argentina";
        int worldCup = 1;

        GenericMethods.print(person, country, worldCup);
        GenericMethods.print(country, worldCup, person);
    }
}
