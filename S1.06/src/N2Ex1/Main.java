package N2Ex1;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Cristiano", "Ronaldo", 38);
        String country = "Portugal";
        int goldenBall = 5;

        GenericMethods.print (person, country, goldenBall);
        //GenericMethods.print (country, goldenBall, person); // No permite porque el primer parámetro es Person
    }
}
