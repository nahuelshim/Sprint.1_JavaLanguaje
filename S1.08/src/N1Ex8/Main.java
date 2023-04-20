package N1Ex8;

public class Main {

    public static void main(String[] args) {

        Reverse reverseWord = (String) -> new StringBuilder(String).reverse().toString();
        System.out.println(reverseWord.reverse("Ganamos la tercera"));
    }
}
