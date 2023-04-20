package N2Ex2;

public class Main {

    public static void main(String[] args) {

        Person person  = new Person("Cristiano", "Ronaldo", 38);
        Person person2 = new Person("Lionel", "Messi", 35);
        String country = "Portugal";
        String country2 = "Argentina";
        int championsLeague  = 5;
        int championsLeague2 = 4;

        GenericMethods.print(person, country, championsLeague);
        System.out.println("----------------------------------------------------------------");
        GenericMethods.print(person,country,championsLeague,person2,country2,championsLeague2);

    }

}
